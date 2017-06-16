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
import { Analysis } from './Analysis';


@Component({
  selector: 'app-brush-zoom-2',
  template: `
    <h1>{{title}}</h1>
    <h2>{{subtitle}}</h2>
    <svg width="500" height="500"></svg>
  `
})
export class BrushZoom2Component implements OnInit {

  allAnalysis: Analysis[] = [];

  private width: number;
  private height: number;
  private margin = {top: 20, right: 20, bottom: 30, left: 40};

  private x: any;
  private y: any;
  private svg: any;
  private g: any;

  constructor(private appService : AppService) {}

  ngOnInit() {
    this.getAnalysis();
  }

  private initSvg() {
    this.svg = d3.select("svg");
    this.width = +this.svg.attr("width") - this.margin.left - this.margin.right ;
    this.height = +this.svg.attr("height") - this.margin.top - this.margin.bottom;
    this.g = this.svg.append("g")
                     .attr("transform", "translate(" + this.margin.left + "," + this.margin.top + ")");;
  }

  getAnalysis() {
    this.appService.getAllAnalysis().subscribe(data => {
      this.allAnalysis = data;
      this.initSvg();
      this.initAxis();
      this.drawAxis();
      this.drawBars();
    });
  }

  private initAxis() {
    this.x = d3Scale.scaleBand().rangeRound([0, this.width]).padding(0.1);
    this.y = d3Scale.scaleLinear().rangeRound([this.height, 0]);
    this.x.domain(this.allAnalysis.map((d) => d.name));
    this.y.domain([0, d3Array.max(this.allAnalysis, (d) => d.instancesCount)]);
  }

  private drawAxis() {
    this.g.append("g")
          .attr("class", "axis axis--x")
          .attr("transform", "translate(0," + this.height + ")")
          .call(d3Axis.axisBottom(this.x));
    this.g.append("g")
          .attr("class", "axis axis--y")
          .call(d3Axis.axisLeft(this.y).ticks(10, "%"))
          .append("text")
          .attr("class", "axis-title")
          .attr("transform", "rotate(-90)")
          .attr("y", 6)
          .attr("dy", "0.71em")
          .attr("text-anchor", "end")
          .text("Frequency");
  }

  private drawBars() {
    this.g.selectAll(".bar")
          .data(this.allAnalysis)
          .enter().append("rect")
          .attr("class", "bar")
          .attr("x", (d) => this.x(d.name) )
          .attr("y", (d) => this.y(d.instancesCount) )
          .attr("width", this.x.bandwidth())
          .attr("height", (d) => this.height - this.y(d.instancesCount) );
  }


}
