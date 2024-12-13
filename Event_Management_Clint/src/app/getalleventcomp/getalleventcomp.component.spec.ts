import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetalleventcompComponent } from './getalleventcomp.component';

describe('GetalleventcompComponent', () => {
  let component: GetalleventcompComponent;
  let fixture: ComponentFixture<GetalleventcompComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetalleventcompComponent]
    });
    fixture = TestBed.createComponent(GetalleventcompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
