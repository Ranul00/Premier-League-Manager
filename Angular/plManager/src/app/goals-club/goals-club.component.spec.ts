import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GoalsClubComponent } from './goals-club.component';

describe('GoalsClubComponent', () => {
  let component: GoalsClubComponent;
  let fixture: ComponentFixture<GoalsClubComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GoalsClubComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GoalsClubComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
