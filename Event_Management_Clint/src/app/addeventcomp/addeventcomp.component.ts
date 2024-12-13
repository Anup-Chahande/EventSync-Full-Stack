import { Component } from '@angular/core';
import { MyserviceService } from '../myservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addeventcomp',
  templateUrl: './addeventcomp.component.html',
  styleUrls: ['./addeventcomp.component.css']
})
export class AddeventcompComponent {
constructor(public service:MyserviceService,private roter:Router){}

  addeventsobject = {
   id:0,
  date:"",
  description:"",
  loaction:"",
  name:"",



  }

  onsubmit(){
this.service.addevent(this.addeventsobject).subscribe((data)=>{

  this.roter.navigate(['getcourse']);


})


  }


}
