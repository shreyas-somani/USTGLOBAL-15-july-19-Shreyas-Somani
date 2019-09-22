import { Component,OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-car-details',
  templateUrl: './car-details.component.html',
  styleUrls: ['./car-details.component.css']
})
export class CarDetailsComponent implements OnInit {

  constructor() { }
  @Input() carDetails:any='';
 

  ngOnInit() {
  }

}
