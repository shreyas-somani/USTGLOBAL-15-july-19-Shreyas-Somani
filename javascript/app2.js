
// var is not requied in declaration of function
//Named functions
function getsum(a,b){

    var c=a+b;
    return c;
}
console.log(getsum(10,12));

//function Expression

var getsum= function(a,b){
    var sum=a+b;
return sum;
}
var sumValue=getsum(5,20);
console.log(sumValue);

// in named expression  function can be called before declaration but in function expression it cannot be called


//ananymous fumction
(function (a,b){
    var sum=a+b;
console.log("sum="+sum);

}(10,20));

//fat arrow function (lambda functi0n in java)
// if only one parament paranthesis also not required// if one line logic is there curly braces not required

//if no parameters directly use parenthesis
var getsum1=(a,b)=>{
    sum=a+b;
    return sum;
}
console.log(getsum1(10,12));



//Hoisting

//console.log(Name);
//var name='Gandhi';
//app2.js:44 Uncaught ReferenceError: Name is not defined
//at app2.js:44


//all globar variables will be hoist to top,but assignment will be below only
//for Eg:console.log(name);
//var name='Gandhi';
// will become
//var name;
//console.log(name);
//name='Gandhi';
//console.log('Gandhi);

var name='Gandhi';
console.log(name);



// function scope is geven preference and then global scope

/*function fnname(){
    console.log(name1);
    var name1='Dinga'
}
fnname();*/
//undefined


function fnname1(){
    var name1;
    console.log(name1);
    name1='Dinga';
    console.log(name1);
}

fnname1();

// if without using var keyword a variable is declared then it will be global scope and not function scope.

//incase of named function oly declaration will be hoisted to top bt not the definition

/*var fname=function(a,b){

}
then here it will execute like
var fname;
function();

here if function is call before Declaration,fname is a variable ,hence it will give erroer:" function not defined"*/


function first(){
    setTimeout(function(){
        console.log("first");
    },1000);
    //seconf parameter 1000 is set time in milliseconds

}
function second(){
    console.log("second");

}
first();
second();

// every function will have its own execution context/stack
//for request from frontend to backend we use ajax,to get data from backend

//passing a function as a parameter  to second function
function first(callback){
    setTimeout(function(){
        console.log("first");
        callback();
    },1000);
    console.log("first");
    
}
function second(){
    console.log("second");
}
first(second); 