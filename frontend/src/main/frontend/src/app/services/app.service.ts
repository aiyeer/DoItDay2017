import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class AppService{
  private analysisUrl = 'http://localhost:8080/getAllAnalysis';
  
  constructor(private http : Http){}
  
  getAllAnalysis() {
    return this.http.get(this.analysisUrl)
  	.map((res: Response) => res.json())
  }

  
}