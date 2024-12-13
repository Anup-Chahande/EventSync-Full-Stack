import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GetalleventcompComponent } from './getalleventcomp/getalleventcomp.component';
import { AddeventcompComponent } from './addeventcomp/addeventcomp.component';
import{HttpClientModule} from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { UpdateeventComponent } from './updateevent/updateevent.component';
import { HomecompComponent } from './homecomp/homecomp.component';
@NgModule({
  declarations: [
    AppComponent,
    GetalleventcompComponent,
    AddeventcompComponent,
    UpdateeventComponent,
    HomecompComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
