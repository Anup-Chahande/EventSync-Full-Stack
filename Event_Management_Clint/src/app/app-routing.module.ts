import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GetalleventcompComponent } from './getalleventcomp/getalleventcomp.component';
import { AddeventcompComponent } from './addeventcomp/addeventcomp.component';
import { UpdateeventComponent } from './updateevent/updateevent.component';
import { HomecompComponent } from './homecomp/homecomp.component';

const routes: Routes = [
{
path:'',redirectTo:'home',pathMatch:'full',
},
  {
  path:'getcourse',component:GetalleventcompComponent

},
{
  path:'addcourse',component:AddeventcompComponent
},

{
  path:'updateevent/:id',component:UpdateeventComponent
},

{
  path:'home',component:HomecompComponent
},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
