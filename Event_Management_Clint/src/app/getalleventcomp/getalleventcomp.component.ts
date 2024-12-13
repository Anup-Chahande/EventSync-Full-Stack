import { Component } from '@angular/core';
import { MyserviceService } from '../myservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-getalleventcomp',
  templateUrl: './getalleventcomp.component.html',
  styleUrls: ['./getalleventcomp.component.css']
})
export class GetalleventcompComponent {
constructor(private service:MyserviceService,private router:Router){}

 alleventdata:any;

ngOnInit(){

  this.service.getallevents().subscribe((data)=>{
    this.alleventdata=data;
    console.log(data)
    

  })



}

deletebyid(id:any){
  this.service.delete(id).subscribe((data)=>{
          this.ngOnInit()
  })



}

updateevent(id:any){
  this.router.navigate([`updateevent/${id}`]);

}
}
