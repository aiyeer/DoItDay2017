/**
 * This component is an adaptation of the "Brush & Zoom II" Example provided by
 * Mike Bostock at https://bl.ocks.org/mbostock/f48fcdb929a620ed97877e4678ab15e6
 */

import { Component, ElementRef, NgZone, OnDestroy, OnInit } from '@angular/core';


import * as d3 from 'd3-selection';
import * as d3Scale from "d3-scale";
import * as d3Shape from "d3-shape";
import * as d3Array from "d3-array";
import * as d3Axis from "d3-axis";

import {AppService} from '../../services/app.service';
import { Node } from './Node';


@Component({
  selector: 'app-drag-zoom-2',
  template: `
    <h1>{{title}}</h1>
    <h2>{{subtitle}}</h2>
    <svg class="linechart" width="500" height="500"></svg>
  `
})
export class DragZoom2Component implements OnInit {

  allNodes: Node[] = [];

  private margin = {top: 20, right: 20, bottom: 30, left: 50};
  private width: number;
  private height: number;
  private x: any;
  private y: any;
  private svg: any;
  private line: d3Shape.Line<[number, number]>;

  constructor(private appService : AppService) {
    this.width = 900 - this.margin.left - this.margin.right ;
    this.height = 500 - this.margin.top - this.margin.bottom;
  }

  ngOnInit() {
    this.getAnalysis();
  }

  getAnalysis() {
    this.appService.getAllNodes().subscribe(data => {
      this.allNodes = data
      this.initSvg();
      this.initAxis();
      this.drawAxis();
      this.drawLine();
    });
  }

  private initSvg() {
    this.svg = d3.select("svg.linechart")
                 .append("g")
                 .attr("transform", "translate(" + this.margin.left + "," + this.margin.top + ")");;
  }

  private initAxis() {
    this.x = d3Scale.scaleTime().range([0, this.width]);
    this.y = d3Scale.scaleLinear().range([this.height, 0]);
    this.x.domain(d3Array.extent(this.allNodes, (d) => d.cpuUsage ));
    this.y.domain(d3Array.extent(this.allNodes, (d) => d.memoryAvailable ));
  }

  private drawAxis() {

    this.svg.append("g")
          .attr("class", "axis axis--x")
          .attr("transform", "translate(0," + this.height + ")")
          .call(d3Axis.axisBottom(this.x))
          .append("text")
          .attr("class", "axis-title")
          .text("Cpu Usage (%)");

    this.svg.append("g")
          .attr("class", "axis axis--y")
          .call(d3Axis.axisLeft(this.y))
          .append("text")
          .attr("class", "axis-title")
          .attr("transform", "rotate(-90)")
          .attr("y", 6)
          .attr("dy", ".71em")
          .style("text-anchor", "end")
          .text("MemoryAvailable (MB)");
  }

  private drawLine() {
    this.line = d3Shape.line()
                       .x( (d: any) => this.x(d.cpuUsage) )
                       .y( (d: any) => this.y(d.memoryAvailable) );

    this.svg.append("path")
            .datum(this.allNodes)
            .attr("class", "line")
            .attr("d", this.line);
  }


}
