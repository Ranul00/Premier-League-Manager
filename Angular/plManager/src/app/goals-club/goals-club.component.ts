import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-goals-club',
  templateUrl: './goals-club.component.html',
  styleUrls: ['./goals-club.component.css']
})

export class GoalsClubComponent implements OnInit {
  
  goalsClub : any;

  constructor(private http : HttpClient) { }

  ngOnInit() {
    let goalsDecending  = this.http.get('http://localhost:8080/goalsDecending');
    goalsDecending.subscribe((data=>this.goalsClub=data));
  }
}