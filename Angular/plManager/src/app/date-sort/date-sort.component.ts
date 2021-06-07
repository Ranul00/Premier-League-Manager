import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-date-sort',
  templateUrl: './date-sort.component.html',
  styleUrls: ['./date-sort.component.css']
})
export class DateSortComponent implements OnInit {

  dateSort: any;

  constructor(private http : HttpClient) { }

  ngOnInit() {
    let dateSort  = this.http.get('http://localhost:8080/dateSort');
    dateSort.subscribe((data=>this.dateSort=data));
  }

}
