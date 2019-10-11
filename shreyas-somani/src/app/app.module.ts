import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from'@angular/forms';


import { AppComponent } from './app.component';
import { SampleComponent} from './sample.component';
import { HeaderComponent } from './header/header.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { DirectivesComponent } from './directives/directives.component';
import { SwitchComponent } from './switch/switch.component';
import { AttributrDirectuseComponent } from './attributr-directuse/attributr-directuse.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { MyDirectiveDirective } from './my-directive.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikeComponent } from './bike/bike.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';

@NgModule({
  declarations: [
    AppComponent, SampleComponent, HeaderComponent, DataBindingComponent, TwoWayComponent, DirectivesComponent, SwitchComponent, AttributrDirectuseComponent, AttributeDirectivesComponent, MyDirectiveDirective, ParentComponent, ChildComponent, BikeComponent, BikeDetailsComponent,
  ],
  imports: [
    BrowserModule,FormsModule


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
