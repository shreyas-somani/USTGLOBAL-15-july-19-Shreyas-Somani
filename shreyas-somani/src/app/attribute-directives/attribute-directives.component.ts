import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directives',
  templateUrl: './attribute-directives.component.html',
  styleUrls: ['./attribute-directives.component.css']
})
export class AttributeDirectivesComponent implements OnInit {
IsSuccess=true;
// IsDanger=true;
classArray=["text-danger","bg-dark","mt-5"];
  constructor() { }

  ngOnInit() {
    setTimeout(()=>{
      this.IsSuccess=false;

    },5000)

    setInterval(()=>{
      this .IsSuccess=!this.IsSuccess;
    },1000)
  }

}

//using basc html and javascriptb make a watch in hrs:min:sec:date:day
