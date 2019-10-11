function validate(){
   let employeeData= document.forms['employeeform'];
   let EmpPass=employeeData.pass.value;
   let EmpCPass=employeeData.cpass.value;
   if(EmpPass=='' && EmpCPass==''){
       return false;
   }
   else if(EmpPass==EmpCPass){
       alert('Success');
       return true;
   } 
   else{

       alert('Password Not Matching')
       return false;
   }
}