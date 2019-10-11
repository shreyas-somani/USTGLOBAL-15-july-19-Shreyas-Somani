var person={
    firstName:"John",
    lastName:"Doe",
    age:50,
    eyeColor:"Brown",
    fullName:function(){
        return this.firstName+" " +this.lastName;
    }
    
}
console.log(person.fullName());
var todayDate = new Date();
console.log('Todays Date = '+todayDate);
var todayDate = new Date(0);//new Date(milliseconds)
console.log('Todays Date = '+todayDate);
var todayDate = new Date("August 24 ,2019 17:22:10");//date string
console.log('Todays Date = '+todayDate);
var todayDate = new Date(2019,08,24,17,23,55,55);
console.log('Todays Date = '+todayDate);
var Day= new Date;
//console.log('Todays Date = '+Day.getDay());
console.log(Math.PI)


var todayDate=todayDate.getMonth();
console.log(todayDate);
var months=['','jan','feb','march','april','may','jun','july','aug','sep','oct','nov','dec'];
console.log(months[todayDate]);

for(var i=1;i<=3;i++)
    {
        var p=(Math.random()*100);
        console.log(Math.round(p));
    }

    var name='Rahul';
    console.log(name);
    var name1=name;
    console.log(name1);
    name1='Gandhi';
    console.log(name);
    console.log(name1);

    var person={
        name:'Thanu'
    }

    console.log(person.name);
    var person1=person;
    console.log(person1.name);
    person1.name='Anu';
    console.log(person.name);
    console.log(person1.name);

    var person2= new Object();
    person2.name="Amir";
    person2.age="55";
    person2.height="5";
    console.log(person2);


    var fruits =['apple','mango','pinapple'];
console.log(fruits);
for(var i=0; i<fruits.length;i++){
    console.log(fruits[i]);
}

var hobbies=['coding','singing','cricket'];
console.log(typeof hobbies);

//type of undefined is undefined
//type of null is object

//to check whether it is array or not
console.log(Array.isArray(hobbies));

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
