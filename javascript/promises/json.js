let employeeJSON = {
    name: 'Dinga',
    age: 24,
    hobbies:['dancing','singing']
}
console.log('My name is'+employeeJSON.name);
//string interpolation
console.log(`My name is ${employeeJSON.name}`);
console.log(employeeJSON);

//multiline comments alt+shift+a
//single line ctrl+shivt+a
//search crtl+shift+d


//converting js object to json object
let jsonObject = JSON.stringify(employeeJSON);
console.log(jsonObject);

//converting json object to javascript
let jsObject= JSON.parse(jsonObject);
console.log(jsObject)
