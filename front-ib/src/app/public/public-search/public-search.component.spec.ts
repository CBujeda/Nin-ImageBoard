import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PublicSearchComponent } from './public-search.component';

describe('PublicSearchComponent', () => {
  let component: PublicSearchComponent;
  let fixture: ComponentFixture<PublicSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PublicSearchComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PublicSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
