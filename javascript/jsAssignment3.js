//Exampl1 array assignment 3 29/07/2019
var fmcg= new Array('Hindustan Unilever Limited', 'Colgate-Palmolive','ITC Limited','Nestle','Parle Agro');
console.log(fmcg);
    fmcg.forEach(function(value,index){
        console.log("Bandra="+value);
    });
    //callback
    fmcg.forEach((value,index) => {
        console.log("Goregaon="+value);
    });
    //is array
   console.log( Array.isArray(fmcg));
   //includes
   console.log(fmcg.includes('Colgate-Palmolive',3));
   //push
   fmcg.push('Rin','Ariel')
console.log(fmcg);
//pop
fmcg.pop();
console.log(fmcg);
//unshift
fmcg.unshift('patanjali','Nirma','Tide');
console.log(fmcg);
//shift
fmcg.shift();
console.log(fmcg);
//splice
fmcg.splice(1,2,'Hindustan Unilever Limited1');
console.log(fmcg);
//slice
fmcg.slice(0,4);
console.log(fmcg);
var newcompany1=fmcg.slice(0,4);
console.log(newcompany1);
//join

console.log(fmcg.join('-'));
//indexof
var newcompany2=fmcg.indexOf('Hindustan Unilever Limited1',0);
console.log(newcompany2);

//map
var newCompany3=fmcg.map((val,index)=>{
    val=val+10;
    return val;
})
console.log(newCompany3);

//filter
var newCompany4=fmcg.filter((val,index)=>{
    return val=='Nirma';
})
console.log(newCompany4);

////Example2 array assignment 3 29/07/2019

var nifty= new Array('Asian Paints Ltd', 'Axis Bank',' Bajaj Auto', 'Bajaj Finance',' Bajaj Finserv', 'Bharti Airtel', 'Bharti Infratel Ltd.',' BPCL', 'Britannia Industries', 'Cipla',' Coal India', 'GAIL',' Grasim Industries', 'HCL Technologies',' HDFC',' HDFC Bank', 'Hero MotoCorp', 'Hindalco Industries', 'Hindustan Unilever', 'ICICI Bank', 'Indiabulls Housing Finance', 'IndusInd Bank', 'Infosys', 'IOC');


console.log(nifty);
nifty.forEach(function(value,index){
        console.log("Bandra="+value);
    });
    //callback
    nifty.forEach((value,index) => {
        console.log("Goregaon="+value);
    });
    //is array
   console.log( Array.isArray(nifty));
   //includes
   console.log(nifty.includes('Bajaj Finance',3));
   //push
   nifty.push('TCS','Tech Mahindra')
console.log(nifty);
//pop
nifty.pop();
console.log(nifty);
//unshift
nifty.unshift('Wipro','Vedanta');
console.log(nifty);
//shift
nifty.shift();
console.log(nifty);
//splice
nifty.splice(1,2,'JSW Steel');
console.log(nifty);
//slice
nifty.slice(0,4);
console.log(nifty);
var ncompany1=nifty.slice(0,4);
console.log(ncompany1);
//join

console.log(nifty.join('-'));
//indexof
var ncompany2=nifty.indexOf('TCS',0);
console.log(ncompany2);

//map
var nCompany3=nifty.map((val,index,)=>{
    val=val+'_Owner';
    return val;
})
console.log(nCompany3);

//filter
var nCompany4=nifty.filter((val,index)=>{
    return val=='JSW Steel';
})
console.log(nCompany4);


//Example1 string assignment 3 29/07/2019

var Company=' Delloite US ';
var newHeroine=Company.toLowerCase();
        console.log(newHeroine);
        var Company1=Company.toUpperCase();
        console.log(Company1);
        var ce1=Company.charAt(5);
        console.log(ce1);
        console.log(newHeroine);
        var ce2=Company.indexOf('i',2);
        console.log(ce2);
        var ce3=Company.concat('oracle','Technology')
        console.log(ce3);
        var ce4=Company.includes('l',3)
        console.log(ce4);
        var ce5=Company.replace('i','o');
        console.log(ce5);
        var ce6=Company.split('a',4);
        console.log(ce6);
        var ce7=Company.substr(0,3);
        console.log(ce7);
        var ce8=Company.search('D');
        console.log(ce8);
        var ce9=Company.trim();
        console.log(ce9);


        var Country='   Peoples    Republic     of     China   ';
var Countryc=Country.toLowerCase();
        console.log(Countryc);
        var Country1=Country.toUpperCase();
        console.log(Country1);
        var co1=Country.charAt(5);
        console.log(co1);
        console.log(Countryc);
        var co2=Country.indexOf('i',2);
        console.log(co2);
        var co3=Country.concat('oracle','Technology')
        console.log(co3);
        var co4=Country.includes('l',3)
        console.log(co4);
        var co5=Country.replace('i','o');
        console.log(co5);
        var co6=Country.split('a',4);
        console.log(co6);
        var co7=Country.substr(0,3);
        console.log(co7);
        var co8=Country.search('h');
        console.log(co8);
        var co9=Country.trim();
        console.log(co9);


