///25/07/19 HW ASSIGNMENT
//write function to find factorial of a number
//Named functions
function FirstFactorial(num) { 

    var factorial = 1;
  if(num===0){
      factorial=1
  }
  else{
    for (var i = 1; i <= num; i++) {  
      factorial = factorial * i;
    }
}
  
    return factorial;
           
  }
     
  console.log(FirstFactorial(4));


  //function Expression

var FirstFactorial= function(num){

    var factorial = 1;
  if(num===0){
      factorial=1
  }
  else{
    for (var i = 1; i <= num; i++) {  
      factorial = factorial * i;
    }
}
  
    return factorial;
           
}
var Value=FirstFactorial(5);
console.log(Value);

//ananymous fumction
(function (num){
    var factorial = 1;
  if(num===0){
      factorial=1
  }
  else{
    for (var i = 1; i <= num; i++) {  
      factorial = factorial * i;
    }
}
  

    console.log("fact="+factorial);

}(5));

//fat arrow function (lambda functi0n in java)
var FirstFactorial=(num)=>{
    var factorial = 1;
    if(num===0){
        factorial=1
    }
    else{
      for (var i = 1; i <= num; i++) {  
        factorial = factorial * i;
      }
  }
    
      return factorial;
}
console.log(FirstFactorial(5));

//fibonacci series
//Named functions
 
function fibo(result,len){
    var num1=result[0],
     num2=result[1],
    next,
    cnt=2;
    while(cnt<len){
        next=num1+num2;
        num1=num2;
        num2=next;
        result.push(next);
        cnt++
    }
    return result;

 
    }
 console.log(fibo([2,3],15));

 //function Expression

var fibo= function(result,len){
    var num1=result[0],
    num2=result[1],
   next,
   cnt=2;
   while(cnt<len){
       next=num1+num2;
       num1=num2;
       num2=next;
       result.push(next);
       cnt++
   }
   return result;


}
var Value=fibo([2,3],15);
console.log(Value);

//ananymous fumction
(function (result,len){
    var num1=result[0],
    num2=result[1],
   next,
   cnt=2;
   while(cnt<len){
       next=num1+num2;
       num1=num2;
       num2=next;
       result.push(next);
       cnt++
   }


  

    console.log("res="+result);

}([2,3],15));



//fat arrow function (lambda functi0n in java)
var fibo=(result,len)=>{
    var num1=result[0],
    num2=result[1],
   next,
   cnt=2;
   while(cnt<len){
       next=num1+num2;
       num1=num2;
       num2=next;
       result.push(next);
       cnt++
   }
   return result;
}
console.log(fibo([2,3],15));
//To find the circumference of the circle

//named function
function Circumference(rad) { 
    var cir=2*3.14*rad;
    return cir;
}

console.log(Circumference(5));

//function expression
var Circumference=function(rad){
    var cir=2*3.14*rad;
    return cir;
}
console.log('circum='+Circumference(5));

//anonymous function
(function(rad){
    
        var cir=2*3.14*rad;
        console.log("rad="+cir);
}(5));

//fat arrow function (lambda functi0n in java)
var Circumference=(rad)=>{
    var cir=2*3.14*rad;
    return cir;
}
console.log(Circumference(5));

//add a number in array
//named function
function add(next){
 var result=[5,6,7,8];
 result.push(next);
 return result;
}
console.log(add(10));

//function expression
var add=function(next){
    var result=[5,6,7,8];
    result.push(next);
    return result;
}
console.log(add(10));

//anonymous function
(function(next){
    var result=[5,6,7,8];
    result.push(next);
    console.log(result);
}(10));

//flat arrow function
  var add=(next)=>{
    var result=[5,6,7,8];
    result.push(next);
    return result;

  }
  console.log(add(10));

  //prime numbers
   //named function
   function primeno(number){
       for(var i=2;i<=number/2;i++){
           if(number%i===0){
               return 'the number is a not aprime number';

           }
           else{
            return 'the number is a prime number'
           }
       }
   }
   console.log(primeno(79));

   console.log('#############################################')

   //function expression

   var primeno=function(number){
    for(var i=2;i<=number/2;i++){
        if(number%i===0){
            return 'the number is a not aprime number';

        }
        else{
         return 'the number is a prime number'
        }
    }
    
   }
   console.log(primeno(79));
   console.log('#############################################')

   //Anonymous function
  ( function(number){
      var a;
    for(var i=2;i<=number/2;i++){
        if(number%i===0){
            a=false;                               
        }
        else{
        
         a=true;
        }
    }
console.log(a);
   }(17));
   

   //flat arrow function

   var primeno=(number)=>{
    for(var i=2;i<=number/2;i++){
        if(number%i===0){
            return 'the number is a not aprime number';

        }
        else{
         return 'the number is a prime number';
        }
    }
    
   }
   console.log(primeno(70));
   console.log('#############################################')

   //add nos in array
   //function expression
   var addition=function(b){
       var temp=0;
       for(var i=0;i<=b.length;i++){
       if(isNaN(b[i])){
           continue;

       }
       temp=temp+b[i];

    }
    return temp;
   }
var ans=[10,20,30,40];
var getSum=addition(ans);
console.log(getSum)
console.log('#############################################')
 //flat arrow function

 var addition=(b)=>{
    var temp=0;
       for(var i=0;i<=b.length;i++){
       if(isNaN(b[i])){
           continue;

       }
       temp=temp+b[i];

    }
    return temp;
    
   }
   var ans=[10,20,30,40];
var getSum=addition(ans);
console.log(getSum)

console.log('#############################################')

//named function
function addddition(b){
    var temp=0;
    for(var i=0;i<=b.length;i++){
    if(isNaN(b[i])){
        continue;

    }
    temp=temp+b[i];

 }
 return temp;
}
var ans=[10,20,30,40];
var getSum=addition(ans);
console.log(getSum)
console.log('#############################################')


 

