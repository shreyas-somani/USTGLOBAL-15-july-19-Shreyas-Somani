import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
// import { registerLocaleData } from '@angular/common';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  ngOnInit(){
   
  }
 
  indianNews:any[]=[];


  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=718ad76fe69246cc96e1da20cd709a41')
   .subscribe(resData=>{
     this.indianNews= resData.articles;
     console.log(this.indianNews);
   })

 
}
}
