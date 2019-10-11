import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switch',
  templateUrl: './switch.component.html',
  styleUrls: ['./switch.component.css']
})
export class SwitchComponent implements OnInit {

  constructor() { }
  condition=true;
  //condition=false;
  
  person='Jenny';
 printInput(element){
  console.log(element.value);

   }

  ngOnInit() {
  }

}
