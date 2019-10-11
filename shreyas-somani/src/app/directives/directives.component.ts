import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

   condition=false;
  users=[{
    id:1232,
    name:'shreyas2',
    city:'Mumbai'
},

{
  id:1233,
  name:'shreyas3',
  city:'Mumbai'
},
{
  id:1234,
  name:'shreyas4',
  city:'Mumbai'
},
{
    id:1235,
    name:'shreyas5',
    city:'Mumbai'
},
{
    id:1236,
    name:'shreyas6',
    city:'Mumbai',
}
]


  constructor() { }
    removeUser(j){
      let index =this.users.indexOf(j);
      this.users.splice(index,1);
      this.condition=true;
      console.log(true);
      

    }
    cloaeall(){
      let indexa =this.users.length;
      console.log(indexa)
      this.users.splice(0,indexa)
    }
  

  ngOnInit() {
  }

}
