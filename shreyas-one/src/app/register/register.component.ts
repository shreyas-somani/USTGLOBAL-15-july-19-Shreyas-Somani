import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl, Validators } from '@angular/forms';
import { NgForm } from '@angular/forms';
import { CustomValidator } from './custom.validator';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  get name(){
    return this.registerForm.get('name');
  }
  get email(){
    return this.registerForm.get('email');
  }
  get tel(){
    return this.registerForm.get('tel');
  }


  constructor() { }
  registerForm= new FormGroup({
    name: new FormControl('',[Validators.minLength(3),
                              Validators.required]),
 email: new FormControl('',[Validators.minLength(5),
                              Validators.email,Validators.required, CustomValidator.noSpace]),
tel: new FormControl('',[Validators.minLength(10),
                              Validators.email,Validators.required])                           
  })

  printForm(form,user){
    console.log(form)
  }
  ngOnInit() {
  }

}
