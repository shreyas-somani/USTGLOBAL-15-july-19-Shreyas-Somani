//26/07/19 Classwork
var hobbies=['singing','dancing','coding','skipping'];
hobbies.forEach(function(value,index){
    console.log("hobbies="+value);
})
// in for each it checs for callby functions inside it

//converting to fat arrow function
hobbies.forEach((value,index)=>{

console.log("hobbies="+value);
});

hobbies.push('bike','travelling')
console.log(hobbies);
//push method's return type is array length

hobbies.pop()// it will roemove element.it will return the removed element
console.log(hobbies);

hobbies.unshift('fun','crawling')
console.log(hobbies);
hobbies.shift();// first index it wil remove
console.log(hobbies);


//TO check if any element is included in array or not
//second maramenter,means it will satart searching from that no.of element
// its return type is boolean;
console.log(hobbies.includes('bike',2));

console.log(Array.isArray(hobbies));// to check whether array or not

//splice is used for adding or removing
//first parameter from where to start to add or delete
//how much to add or delete is second parameter
//what to add or delete is 3rd parameter
//it will return deleted items
hobbies.splice(5,1,"bike")
console.log(hobbies)
//not modify original array use slice
////2 parameters start index and end index,last index-1,not consider last index

console.log(hobbies.slice(2,3));
console.log(hobbies);
//for every elemennt joins will add separater and return as string
console.log(hobbies.join('-'));// for join method if no parameters are passd it wil add , in between them// IT WILL NOT MODIFY ORIGINAL ARRAY


var hobbies1=hobbies.indexOf('dancing')
console.log(hobbies1)
// it it returns -1 element is not present
//if greater then -1 element is present


//we use map element to perform same operation all elements

var numbers=[10,20,30,40];
var newNumbers=numbers.map((val,index)=>{
    val=val+10;
    return val;
})

console.log("Old array="+numbers);
console.log(
    "###############################################"
)
console.log("new array="+newNumbers);


//withou map using push

var nn=[];
for (var i=0;i<=numbers.length;i++){
    numbers1=numbers[i]+10;
    nn.push(numbers1);

}
console.log(nn);





/// to filter

var nn1=numbers.filter((val,index)=>{
    return val>30;
})
console.log(nn1);











//new

var items=[{
    item:'pen',
    price:50
},
{
    item:'bag',
    price:500
},{
    item:'laptop',
    price:5000

},
{
    item:'mouse',
    price:500
}
]

var mapItems=items.map((val)=>{
    val.price=val.price+10;
    return val;
})
console.log(mapItems);
console.log("$$$$$$$$$$$$$$$$$$$$$");


var filterItems= items.filter((val)=>{

    return val.price>100  && val.item.length>3;
});
console.log(filterItems);


//String methods
/*
toLowerCase()
toUpperCase();
charAt:-"apple"
        "01234" i.e at 0 a is position ,at 1 p is present

        //trim method will remove all white space from string
        //trim lest trim start are same
        //trime right and trime end both are same*/

        var heroineName='Alia Bhat';
        var newHeroine=heroineName.toLowerCase();
        console.log(newHeroine);
        var newHeroine1=heroineName.toUpperCase();
        console.log(newHeroine1);
        var he1=heroineName.charAt(0);
        console.log(he1);
        console.log(newHeroine);
        var he2=heroineName.indexOf('i',2);
        console.log(he2);
        var he3=heroineName.concat('banana','orange')
        console.log(he3);
        var he4=heroineName.includes('l',3)
        console.log(he4);
        var he5=heroineName.replace('i','o');
        console.log(he5);
        var he6=heroineName.split('a',4);
        console.log(he6);
        var he7=heroineName.substr(0,3);
        console.log(he7);
        var he8=heroineName.search('B');
        console.log(he8);
        var he9=heroineName.trim();
        console.log(he9);













