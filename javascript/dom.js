//add or modify content of webpage, for this purpose dom is used
//getElementById()
let pElement =  document.getElementById('demo');
console.log(pElement);
pElement.textContent="This is new p tag";
//get element with calss multiple elements in array
//getElementByClass()
let divElements =  document.getElementsByClassName('blue');
console.log(divElements);
let pElements=document.getElementsByTagName('p');
console.log(pElements);


let nameElements=document.getElementsByName('h1element');
console.log(nameElements);
let demoElements=document.querySelector('#demo');
console.log(demoElements);
let blueClassElements=document.querySelectorAll('.blue');
console.log(blueClassElements);
let buttonElements=document.createElement('button');
buttonElements.textContent="Click Me";
console.log(buttonElements);
//it will return nodelist
//querySelector will return element and will take all class,id and tagname as input
//querySelectAll will return nodelist and will take all class,id and tagname as input
//createelement ('button') returns element

//method name append child(); to add element using js ,pass the element that should be added
document.body.appendChild(buttonElements);

let spanElements=document.getElementById('spanid');
spanElements.style.color='pink';
//font-size in css, fontSize in js

let buttonElement1 = document.getElementById('buttonEle');
//buttonElement1.className='add';
buttonElement1.classList='add add1'

let tableEle=document.createElement('table');
let tr1=document.createElement('tr');
let trd1=document.createElement('td');
trd1.textContent='Name';
let trd2=document.createElement('td');
trd2.textContent='Age';
let tr2=document.createElement('tr');
let tr2d1=document.createElement('td');
tr2d1.textContent='John';
let tr2d2=document.createElement('td');
tr2d2.textContent='14';
let tr3=document.createElement('tr');
let tr3d1=document.createElement('td');
tr3d1.textContent='Dinga';
let tr3d2=document.createElement('td');
tr3d2.textContent='20';
let tr4=document.createElement('tr');
let tr4d1=document.createElement('td');
tr4d1.textContent='Sundari';
let tr4d2=document.createElement('td');
tr4d2.textContent='22';
document.body.appendChild(tableEle);
tr1.appendChild(trd1);
tr1.appendChild(trd2);
tr2.appendChild(tr2d1);
tr2.appendChild(tr2d2);
tr3.appendChild(tr3d1);
tr3.appendChild(tr3d2);
tr4.appendChild(tr4d1);
tr4.appendChild(tr4d2);
tableEle.appendChild(tr1);
tableEle.appendChild(tr2);
tableEle.appendChild(tr3);
tableEle.appendChild(tr4);




document.getElementById('tableid').innerHTML= `
<table border="1">
<tr>
    <td>Name</td>
    <td>Age</td>
</tr>
<tr>
    <td>John</td>
    <td>14 </td>
</tr>
<tr>
    <td>  Dinga</td>
    <td> 22</td>
</tr>
</table>`;




let pElementData=document.getElementById('demo1');
//pElementData.style.color='Blue';
/*
pElementData.className='blue
//this will maas blueke the className of the p tag 

*/

pElementData.classList='blue fonts';


