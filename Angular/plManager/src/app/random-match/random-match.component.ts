import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-random-match',
  templateUrl: './random-match.component.html',
  styleUrls: ['./random-match.component.css']
})
export class RandomMatchComponent implements OnInit {

  randomMatch: any;

  constructor(private http : HttpClient) { }

  ngOnInit() {
    let randomMatch  = this.http.get('http://localhost:8080/randomMatch');
    randomMatch.subscribe((data=>this.randomMatch=data));
  }

}
