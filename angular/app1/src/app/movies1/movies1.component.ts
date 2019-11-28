import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-movies1',
  templateUrl: './movies1.component.html',
  styleUrls: ['./movies1.component.css']
})
export class Movies1Component implements OnInit {
  @Input() car4: {imgUrl: string , name: string};

  constructor() { }

  ngOnInit() {
  }

}
