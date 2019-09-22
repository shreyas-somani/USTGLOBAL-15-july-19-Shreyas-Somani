import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  CarData: any='';
  cars=[
    {img:'https://media.zigcdn.com/media/model/2019/Sep/renault-triber_360x240.jpg',
    brand:'Renault Triber',
    description:'The ultra-modular Renault TRIBER comes with 4 exciting modes and 100+ seating combinations to give you all the space you need for your tribe and new experiences.'

    },{img:'https://media.zigcdn.com/media/model/2019/Sep/kia-seltos_930x620.jpg',
    brand:'Kia Seltos',
    description:'Most Suave and smart interiors. Segment 1st 360-degree camera & Smart 20.32cm (8.0”) HUD. UVO Connect - Remote Start and Voice Recognition with 37 Connectivity Features. Book Now! Tiger Nose Grille. World Class Quality. Cutting Edge Tech. Straight Line Designs.'

    },{img:'https://media.zigcdn.com/media/model/2019/Sep/maruti-xl6_930x620.jpg',
      brand:'Maruti Suzuki XL6' ,
      description:'The Maruti Suzuki XL6 is the newest MPV in the town and its the first 3-row model to be offered by the Nexa brand'
    }
  ]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    this.CarData=car;
  }

}
