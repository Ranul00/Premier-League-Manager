import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-manager',
  templateUrl: './manager.component.html',
  styleUrls: ['./manager.component.css']
})
export class ManagerComponent implements OnInit {

  pointsclubs:any;
  

  constructor(private http : HttpClient) { }

  ngOnInit() {
    let pointSort  = this.http.get('http://localhost:8080/pointSort');
    pointSort.subscribe((data=>this.pointsclubs=data));
  }

}
