import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DateSortComponent } from './date-sort.component';

describe('DateSortComponent', () => {
  let component: DateSortComponent;
  let fixture: ComponentFixture<DateSortComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DateSortComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DateSortComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
