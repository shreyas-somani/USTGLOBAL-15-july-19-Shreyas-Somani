function sayHello() {
alert('Hello!!!!!!!!!!!!!!!!!');
}
let butEle=document.getElementById('ClickButton');
butEle.onclick= function(){
    butEle.textContent='New Button';
alert('Hello World!!!!!!!!!!!!!!!!');
}
let creation1 = document.createElement('button');
creation1.textContent='1+1=2';
document.body.appendChild(creation1);
function createPelement(){
    let pElementData =document.createElement('p');
    pElementData.textContent='This is PElement';
    document.body.appendChild(pElementData);
}

let creation2 = document.createElement('button');
creation2.addEventListener('click',function(){
 creation2.textContent='3rd button';
    alert("Good evening");
});
document.body.appendChild(creation2);

let wings=document.getElementById('alertHi');
wings.addEventListener('click',function(){

    alert("Good evening Everyone");

});
/*
function showText(){
let creation3=document.getElementById("showData");
console.log(creation3.value);
let h1Element=document.createElement('hi');
h1Element.textContent=creation3.value;
document.body.appendChild(h1Element);
}*/

// create the element outside the function to get single output
let h1Element=document.createElement('hi');
function showText(){
    let creation3=document.getElementById("showData");
    console.log(creation3.value);

    h1Element.textContent=creation3.value;
    document.body.appendChild(h1Element);
    }