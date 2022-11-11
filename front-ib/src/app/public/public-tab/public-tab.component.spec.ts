import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PublicTabComponent } from './public-tab.component';

describe('PublicTabComponent', () => {
  let component: PublicTabComponent;
  let fixture: ComponentFixture<PublicTabComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PublicTabComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PublicTabComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
