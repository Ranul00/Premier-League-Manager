import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WinsClubComponent } from './wins-club.component';

describe('WinsClubComponent', () => {
  let component: WinsClubComponent;
  let fixture: ComponentFixture<WinsClubComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WinsClubComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WinsClubComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
