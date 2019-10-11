import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributrDirectuseComponent } from './attributr-directuse.component';

describe('AttributrDirectuseComponent', () => {
  let component: AttributrDirectuseComponent;
  let fixture: ComponentFixture<AttributrDirectuseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AttributrDirectuseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AttributrDirectuseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
