let myName: string ='Hello Shreyas';
let company:any;
company='testyantra';
company=23;
console.log(company)
console.log(myName)

let sample : number | boolean;
sample=32;
sample=true;
console.log(sample);


let myArray:any[]=[1345,'kkjk','fsegzbt',true]
//internall it is like
console.log(myArray);
let myA:string[]=['SDFGHJK','ADSFGH'];
console.log(myA);
let myTuple:[string,number,boolean]=['',2,true];
//enum is a keyword to specify name
enum Colors{
    red=300,
    green,
    blue,
    black,
}
//the nos will go jin incremental style

console.log(Colors.black)

enum Colo{
    red='Danger',
    green='success',
    blue='primary',
    black='dark ',
}
//if we initialize one as string ,we need to initialize al

console.log(Colo.black)

class Person{
   // name:string='Raja';
   // age:number=23;
    
//constructor(public Personname:string,privazte Personage:number){
  constructor(public Personname:string,public Personage:number){
  //  this.name=Personname;
  //  this.age=Personage;

}
}
let person=new Person('Raja1',21);
console.log(person.Personage);

let mName='Raja2'
mName=null;
console.log(mName);


class Car{
  brand:string='BMW';//non ststic object
  static model:string='X5';
}

let brand1= new Car();
console.log(brand1.brand);
console.log(Car.model)//static member


class Car1{
  constructor(public brand:string,public model:string){

  }
}
let bmwCar= new Car1('BMW','X5');
console.log(bmwCar.brand);
console.log(bmwCar.model);

let benzCar: Car1 ={
  brand:'Benz',
  model:'0002'
}

class Person1{
  salary:number= 567111;
  constructor(public name: string, public age: number){}
    
  }
  

  class Student extends Person1{

    constructor(public Myname: string, public age: number, public USN: number){
      super(Myname,age);
      
    }
}



let person1= new Person1('Dinga',23);
let person2=new Student('Dingi',34,99);
console.log(person1.salary)




class P2{
  constructor(public name:string,public age:number,public degree ?:string){

  }
}
let person3: P2 ={
  name:'kjhgfcd',
  age:34

}
let person4: P2 ={
  name:'kjhgfcd',
  age:40,
  degree:'asd'
}

//only abstract classes in interfaces
//abstract means no body{}
interface Student3{
name:string;
age:number;
printDetails():void


} 
class Stud5 implements Student3{
  name='Raja';
  age=23;
  printDetails(){
    console.log("name is"+ this.name +'age is'+this.age)
  }

}
let person5=new Stud5();
person5.printDetails();

let st1:Student3={
  name:'xyz',
  age:23,
  printDetails:()=>{
    console.log("name is"+st1.name +'age is'+st1.age)

  }
}
st1.printDetails();



// just keeping a question mark  can make it optional
//here degree is optional



