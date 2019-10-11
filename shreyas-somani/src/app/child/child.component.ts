import { Component, OnInit, Input, Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
@Output() childData=new EventEmitter();
@Input() dataFromParent='';

sendurl(url){
  return url="https://media-cdn.tripadvisor.com/media/photo-s/03/32/7c/bd/nick-bollettieri-tennis.jpg";
}
  constructor() { }

  ngOnInit() {


    this.childData.emit('this is data from child');
  }

}
