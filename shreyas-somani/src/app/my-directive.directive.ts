import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elementRef:ElementRef) { 
    elementRef.nativeElement.style.background='pink';
    elementRef.nativeElement.style.color='white';
    elementRef.nativeElement.style.padding='60px';
    elementRef.nativeElement.style.marginTop='70px';
    


}
// 

// @HostListener('mouseenter')
  

// mouseEnter(){
// //   console.log(mouseenter);

// this.elementRef.nativeElement.style.background='red';
// this.elementRef.nativeElement.style.color='white';
// this.elementRef.nativeElement.style.fontSize='40px';
//   }
//   //variable which contains element ref objects

//   @HostListener('mouseleave')
//   mouseLeave(){
//     //   console.log(mouseenter);
    
//     this.elementRef.nativeElement.style.background='green';
//     this.elementRef.nativeElement.style.color='red';
//     this.elementRef.nativeElement.style.fontSize='20px';
//       }
// }

//inorder to create a dirrective wwe need to import a special class ElementRef
//we can apply directives in normal html tags

//we naeed a concept called adependency selection
//we cannot creatre object pof component class
//we cannot create object of normal class
//one component class cannotbbe imporetd in another compnet class
//not applied for other classes
//we call alll the classes in constructor only

@HostBinding('style.background')  background:string;

@HostListener('mouseenter')
  

mouseEnter(){
  this.background='skyblue';
//   console.log(mouseenter);

  }
  //variable which contains element ref objects

  @HostListener('mouseleave')
  mouseLeave(){
    //   console.log(mouseenter);
    
    this.background='purple';
      }
}

