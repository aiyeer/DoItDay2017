import { Component } from '@angular/core';
import 'rxjs/add/operator/map';
import {AppService} from './services/app.service';
import { IntervalObservable } from 'rxjs/observable/IntervalObservable';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {


 	title = 'D3 Angular Demo';

 	allAnalysis: any = {};
  allNodes: any = {};
  allNotifications: any = {};
  allInstances: any = {};
  allCommunications: any = {};
  allUpdates: any = {};

  constructor(private appService: AppService) { 
  	
  }

  autoRefresh() {
  	IntervalObservable.create(10000).subscribe(() => {

    	this.getAnalysis();
      this.getNodes();
      this.getNotifications();
      this.getInstances();
      this.getCommunications();
      this.getScheduledUpdates();
    });
  }

	getAnalysis() {
	  this.appService.getAllAnalysis().subscribe(data => {
	  	this.allAnalysis = data;
	  });
  }

  getNodes() {
    this.appService.getAllNodes().subscribe(data => {
      this.allNodes = data
    });
  }

  getNotifications() {
    this.appService.getAllNotifications().subscribe(data => {
      this.allNotifications = data
    });
  }

  getInstances() {
    this.appService.getAllInstances().subscribe(data => {
      this.allInstances = data
    });
  }

  getCommunications() {
    this.appService.getAllCommunications().subscribe(data => {
      this.allCommunications = data
    });
  }

  getScheduledUpdates() {
    this.appService.getScheduledUpdates().subscribe(data => {
      this.allUpdates = data
      });
  }
}
