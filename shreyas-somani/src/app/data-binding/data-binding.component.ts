import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent  {

  name='Shreyas';
  imgURL='https://cdn.pixabay.com/photo/2015/06/25/17/56/people-821624_1280.jpg'
  textClasses='bg-success text-white';
  redColor=true;
  paragraphStyles='blue';
  prasS=true;
  padding='50px'
  columnSpan=2;

  constructor() {

    setTimeout(() => {
      this.redColor=false;
      this.prasS=false;
    }, 5000);

   }

 

}
