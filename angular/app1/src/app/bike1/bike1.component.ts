import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bike1',
  templateUrl: './bike1.component.html',
  styleUrls: ['./bike1.component.css']
})
export class Bike1Component implements OnInit {
  @Input() car1 : {imgUrl: string , name: string};

  constructor() { }

  ngOnInit() {
  }

}
