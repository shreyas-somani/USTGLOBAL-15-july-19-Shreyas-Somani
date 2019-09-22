import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { CarComponent } from './car/car.component';
import { HeaderComponent } from './header/header.component';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AddTaskComponent } from './add-task/add-task.component';
import { ViewAllTaskComponent } from './view-all-task/view-all-task.component';

@NgModule({
  declarations: [
    AppComponent,
    CarDetailsComponent,
    CarComponent,
    HeaderComponent,
    AddTaskComponent,
    ViewAllTaskComponent
  ],
  imports: [
    BrowserModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
