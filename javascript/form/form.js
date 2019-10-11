function validateForm(){
    let formData=document.forms[0];
    //console.log(formData);
   // console.log(formData.uname.value);
let userName=formData.uname.value;
let Password=formData.password.value;
if(userName.length>4 && Password.length>7){
    console.log('Success username');
formData.uname.style.border='4px solid green'
formData.password.style.border='4px solid green'
formData.loginSubmit.disabled=false;
}
else{
    formData.uname.style.border='4px solid red'
    formData.password.style.border='4px solid red'
    formData.loginSubmit.disabled=true;
  
}


}

