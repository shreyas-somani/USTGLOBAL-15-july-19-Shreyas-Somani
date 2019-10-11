var fruits =['apple','mango','pinapple'];
console.log(fruits);
for(var i=0; i<fruits.length;i++){
    console.log(fruits[i]);
}
var todayDate = new Date();
console.log('Todays Date = '+todayDate);
var todayDate = new Date(0);//new Date(milliseconds)
console.log('Todays Date = '+todayDate);
var todayDate = new Date("July 24 ,2019 17:22:10");//date string
console.log('Todays Date = '+todayDate);
var todayDate = new Date(2019,07,24,17,23,55,55);
console.log('Todays Date = '+todayDate);

var todayDate=todayDate.getMonth();
console.log(todayDate);


var months=['','jan','feb','march','april','may','jun','july','aug','sep','oct','nov','dec'];
console.log(months[todayDate]);

    console.log(Math.ceil(4.6));
    console.log(Math.random());
    console.log(Math.floor(4.5));
    console.log(Math.round(7.9));
    console.log(Math.pow(3,2));

 
   for(var i=1;i<=3;i++)
    {
        var p=(Math.random()*100);
        console.log(Math.round(p));
    } 

//Primitive
    var name='Rahul';
    console.log(name);
    var name1=name;
    console.log(name1);
    name1='Gandhi';
    console.log(name);
    console.log(name1);


//Reference
    var person={
        name:'Thanu'
    }

    console.log(person.name);
    var person1=person;
    console.log(person1.name);
    person1.name='Anu';
    console.log(person.name);
    console.log(person1.name);
//Homework
    //reference datatype-object
    var person2= new Object();
    person2.name="Amir";
    person2.age="55";
    person2.height="5";
    console.log(person2);

    //Array using new
    var fruit=new Array('Apple','orange','guava');
    console.log(fruit);

    //25072019

    var num1=10;
    var name='MyName';
    var num2='10';
    if(num1==num2){
        console.log("Equal")
    }else{
        console.log("Not Equal");
    }
//====(strict equal to will check the type of the is also equal)

var num1=10;
var name='MyName';
var num2='10';
if(num1===num2){
    console.log("Equal")
}else{
    console.log("Not Equal");
}//Always use strict equal to===

var num11=10;
var name1='MyName';
var num21='10';
var equals=(num1===num2)?'true':'false';
console.log(equals);

//how to write else if in ternary

var nu1=10;
var name1='MyName';
var nu2=20;
console.log((nu1>10)?'greater':(nu1==10)?'equals':'lesser');


//type of operator
var myAge=50;
console.log(typeof myAge);

var myName='Chandan';
console.log(typeof myName);

var hobbies=['coding','singing','cricket'];
console.log(typeof hobbies);

//type of undefined is undefined
//type of null is object

//to check whether it is array or not
console.log(Array.isArray(hobbies));

//complex rray
var library=[
    {author:'Bill Gates' ,
    title:'The Road Ahead' ,
    bookID:11254},
    {author:'Steve Jobs',title:'Water Issacson', bookID: 4264},
    {author:'Suzanne Collins',title:'Mockingjay :The final book of the hunger games',bookID:3254}];
    for(var i=0;i<library.length;i++){
    console.log(library[i]);
    console.log(library[i].author);
    }



//data from backend is jason or xml format



// for in --objects

console.log("========================");
for(var index in hobbies){
    console.log("Hobbies="+hobbies[index]);
}
console.log("========================");
var person={
    name:'Chandan',
    age:28
};

for(var i in person){
    console.log(person[i]);
}

// javascript is single threaded
console.log("========================");
for(var index of hobbies){
    console.log("Hobbies="+index);
}

/*
var val=2;
if (val==2){
    break;
    console.log(val);
}*/

//break is only break loops not block statements like if

for(var i=0;i<hobbies.length;i++)
{
    if(hobbies[i]){
        console.log(i);
        break;
    
    }
}




var hobbies=['singing','dancing','riding'];
hobbies[6]='skipping';
hobbies['name']='jumping';
//for in will not ignore hobbies ['name']='jumping'
//for off will ignore

for(var index in hobbies){

    console.log("Hobbies = "+hobbies[index])
}
for(var index of hobbies){

    console.log("Hobbies = "+index)
}
console.log("========================");
console.log(hobbies);
console.log("========================");

