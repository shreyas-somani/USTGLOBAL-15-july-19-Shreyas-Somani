function sum(a,b){
    function addSum(){
        return a+b;
    }
    return addSum;
}
var addFunc= sum(10,20);var total= addFunc();
console.log('Total',total);
console.log('####################')
console.log(window);
console.log(this);
console.log(this===window);
var name='Rakshit';
console.log(window.name);
var person={
name:'Dulquer salman',
age:20,
getName:function(){
    console.log('getName method'+this);
    console.log(window);
    function getData(){

        console.log('get data',this.name);
    }
    return this.name;
}

}
var heroName=person.getName();
console.log("Name="+heroName);

//whenever to invoke a method using object reference, then your "this" keyword consists of that object

console.log("###################");

//two keywords let and cons
//using let keyword redeclaring is not possible

// for let
/*
let name;//possible
let name;//not possible
    name='Rakshith'//possible
    name='Salman'//possible
    */
   for(var i=0;i<5;i++){
       console.log(i);
   }
   console.log('Value of i'+i);
// var keyword is global scope or function scpoe
for(let j=0;j<5;j++){
    console.log(j);
}
//console.log('Value of j'+j);
//let has block scope

//for constant keyword u cannot only declare;u should declare and initialize
//in js const is like final in java
/*
const name//not possible
const name='Salman'//possible
const name='Rakshith'//not possible
     name='Shahrukh'//not possible


     we cannot reinitialize or redeclare but fe can modify
     const hobbies=['s','d']
     hobbies[0]='cricket'//modifying is possible

     //never use var keyword a functionality will change
     
     */
var hobbies = ['dancing','singing','cricket'];
console.log('Hobbies  '+hobbies);
var hobbies=['numismatics'];
console.log('Hobbies  '+hobbies);
hobbies=['singing'];
console.log("++++++++++++++++++++++")
let fruits=['Orange','Banana'];
console.log('Fruits  '+fruits);
/*
let fruits=['JackFruit'];
console.log('Fruits'+fruits);
Identifier 'fruits' has already been declared
*/


fruits=['JackFruit'];
console.log('Fruits'+fruits);// no error as reinitialization is possible

// using const
const items=['lipsticks','kajals','deo','wallet'];
console.log('Item= '+items)

/*
const items=['bag','book']
console.log('Item= '+items)

Identifier 'items' has already been declared*/
/*
items=['laptops'];
console.log('Item= '+items)
Uncaught TypeError: Assignment to constant variable.
*/

// for netsed array
items[0]=['bag','book'];
console.log('Item= '+items);

