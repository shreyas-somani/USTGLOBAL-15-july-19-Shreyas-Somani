import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import{HttpClientModule} from'@angular/common/http';

import { AppComponent } from './app.component';
import { AddTaskComponent } from './add-task/add-task.component';
import { EditTaskComponent } from './edit-task/edit-task.component';
import { ShowAllComponent } from './show-all/show-all.component';
import { TaskComponent } from './task/task.component';

@NgModule({
  declarations: [
    AppComponent,
    AddTaskComponent,
    EditTaskComponent,
    ShowAllComponent,
    TaskComponent
  ],
  imports: [
    BrowserModule,RouterModule.forRoot([{path:'addtask',component:AddTaskComponent},
    {path:'edittask',component:EditTaskComponent},
  {path:'showall',component:ShowAllComponent}
]),FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
