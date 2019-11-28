import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Mobiles1Component } from './mobiles1.component';

describe('Mobiles1Component', () => {
  let component: Mobiles1Component;
  let fixture: ComponentFixture<Mobiles1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Mobiles1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Mobiles1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
