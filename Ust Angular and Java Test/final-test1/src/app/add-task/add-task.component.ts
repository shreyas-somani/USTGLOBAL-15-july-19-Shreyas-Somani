import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  constructor(private taskservice:TaskService,private router: Router) { }

  ngOnInit() {
  }
  addTask(add) {
    this.taskservice.sendData(add).subscribe(data=>{
      console.log(data);
    },err=>{
      console.log(err);
    });
  }

}
