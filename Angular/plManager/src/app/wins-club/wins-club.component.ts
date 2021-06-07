import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-wins-club',
  templateUrl: './wins-club.component.html',
  styleUrls: ['./wins-club.component.css']
})
export class WinsClubComponent implements OnInit {

  winsClub: any

  constructor(private http : HttpClient) { }

  ngOnInit() {
    let pointSort  = this.http.get('http://localhost:8080/winsDecending');
    pointSort.subscribe((data=>this.winsClub=data));
  }

}
