import { Component } from '@angular/core';
import { MyserviceService } from '../myservice.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-updateevent',
  templateUrl: './updateevent.component.html',
  styleUrls: ['./updateevent.component.css']
})
export class UpdateeventComponent {
  addeventsobject:any;
  pathid:any;
  
 
  constructor(private service:MyserviceService,private activateroute:ActivatedRoute,private router:Router){
 }
ngOnInit(){
this.activateroute.paramMap.subscribe((params)=>{

         this.pathid=params.get('id');
            this.service.getbyid(this.pathid).subscribe((data)=>{
              this.addeventsobject=data;
            

            });

             



})

  
}
updatedata(){
  this.service.updatedata(this.addeventsobject).subscribe((data)=>{

    this.router.navigate(['getcourse']);





  })





}


}
