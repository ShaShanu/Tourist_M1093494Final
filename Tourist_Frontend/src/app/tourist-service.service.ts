import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Tourist } from './tourist';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TouristServiceService {
  group(arg0: {}): import("@angular/forms").FormGroup<any> {
    throw new Error('Method not implemented.');
  }
  baseUrl="http://localhost:8000/tourist/set"
  listUrl="http://localhost:8000/tourist/get"
  
  constructor(private HttpClient: HttpClient) { }
  
  setTourist(tourist: Tourist):Observable<object>{
    console.log(tourist);
    return this.HttpClient.post(`${this.baseUrl}`,tourist);
  }

  getTourist(){
    return this.HttpClient.get(this.listUrl)
  }
}
