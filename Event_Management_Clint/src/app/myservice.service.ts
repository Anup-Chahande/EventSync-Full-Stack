import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MyserviceService {

  constructor(private http:HttpClient) {}
  apiurl="http://localhost:8080/events";
  

getallevents():Observable<any>{


return this.http.get(this.apiurl)

}

addevent(data:any):Observable<any>{


  return this.http.post(this.apiurl,data)



}
delete(id:any):Observable<any>{


  return this.http.delete(`${this.apiurl}/${id}`)



}

getbyid(id:any):Observable<any>{


  return this.http.get(`${this.apiurl}/${id}`)



}

updatedata(data:any):Observable<any>{


  return this.http.put(this.apiurl,data)



}



}
