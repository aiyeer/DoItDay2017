import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class AppService{
 	private analysisUrl = '/';
  
 	constructor(private http : Http){}
  
  	getAllAnalysis() {
    	return this.http.get(this.analysisUrl + "getAllAnalysis")
  		.map((res: Response) => res.json())
  	}

    getAllNodes() {
    	return this.http.get(this.analysisUrl + "getAllNodes")
  		.map((res: Response) => res.json())
 	}

 	getAllNotifications() {
    	return this.http.get(this.analysisUrl + "getAllNotifications")
  		.map((res: Response) => res.json())
 	}

 	getAllInstances() {
    	return this.http.get(this.analysisUrl + "getAllInstances")
  		.map((res: Response) => res.json())
 	}

 	getAllCommunications() {
    	return this.http.get(this.analysisUrl + "getAllCommunications")
  		.map((res: Response) => res.json())
 	}

}