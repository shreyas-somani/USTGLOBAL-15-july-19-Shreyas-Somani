import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class TaskService {
  
  
  taskInfo: any[] = [];
  constructor(private http: HttpClient) { }
  getData(){
    
    return this.http.get<any>
    ('http://localhost:9094/task/get-all-tasks').subscribe(data=>{
      this.taskInfo=data.manager;
      console.log(this.taskInfo);
    }),err=>{
      console.log(err);
    },()=>{ 
      console.log("Data Sent");
    }
  }
 deleteData(data) {
    return this.http.delete(`http://localhost:9095/task/remove/${data}`);
  }

 sendData(data) {
   return this.http.post(' http://localhost:9095/task/add' ,data);
    // return this.http.post('http://localhost:9094/task/add',data);
  }

  update(data) {
    return this.http.put(' http://localhost:9095/task/modify' ,data);
    // return this.http.put('http://localhost:/9094/task/modify',data);
  }

  
}
