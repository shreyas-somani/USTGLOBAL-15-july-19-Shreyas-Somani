let resultData=new Promise(function(resolve,reject){
    if(10==10){
        reject('Failed');
    }else{
        resolve('Success');
    }
});
resultData.then((data)=>{
    console.log('Then block'+data);
}).catch((error)=>{
    console.log('Then block'+error);
});

let employeeData=new Promise(function(resolve,reject){
    const employee=[
        {
            name:'Shahrukh',
            age:62
        },
        {
            name:'Sundari',
            age:45,
        },
        {
            name:'Akshay',
            age:50
        }
    ]
    if(10>10){
        reject('Failed');
    }else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
   // console.log('Then block =',data);//instead of + operator use ,
   return data;
}).catch((error)=>{
    console.log('Then block =',error);
}).then(function(data1){
    console.log('This is Then Bllock 2',data1)
});//es6
//es8