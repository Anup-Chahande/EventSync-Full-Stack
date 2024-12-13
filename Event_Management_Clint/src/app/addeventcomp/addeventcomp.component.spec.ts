import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddeventcompComponent } from './addeventcomp.component';

describe('AddeventcompComponent', () => {
  let component: AddeventcompComponent;
  let fixture: ComponentFixture<AddeventcompComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddeventcompComponent]
    });
    fixture = TestBed.createComponent(AddeventcompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
