import { Component } from '@angular/core';
import 'rxjs/add/operator/map';
import {AppService} from './services/app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'D3 Angular Demo';

  data: any = {};

  constructor(private appService: AppService) {

  	this.getAnalysis();

  }

  getAnalysis() {
	  this.appService.getAllAnalysis().subscribe(data => {
	  	this.data = data
	  })
  }
}
