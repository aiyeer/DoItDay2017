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

 	data: any = {};
 	n: number = 0;

  	constructor(private appService: AppService) { 
  		this.autoRefresh();
  	}

  	autoRefresh() {
  		IntervalObservable.create(10000).subscribe(() => {
    		console.log('hi');
    		this.getAnalysis();
    	});
  	}

	getAnalysis() {
	  	this.appService.getAllAnalysis().subscribe(data => {
	  		this.data = data
	  	});
  	}
}
