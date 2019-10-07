import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-edit-task',
  templateUrl: './edit-task.component.html',
  styleUrls: ['./edit-task.component.css']
})
export class EditTaskComponent implements OnInit {

  constructor(private task: TaskService, private router: Router) { }

  ngOnInit() {
    this.task.getData();
  }
  delete(ta){
    this.task.deleteData(ta)
      .subscribe( resData => {
        console.log(resData);
        this.router.navigateByUrl("/showall");
      })
    }

      updateTask(ta){
         this.task.update(ta).subscribe(data=>{
           console.log(data);
          this.router.navigateByUrl('/showall');
        })
      }
      
     
      }




