import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-mobiles1',
  templateUrl: './mobiles1.component.html',
  styleUrls: ['./mobiles1.component.css']
})
export class Mobiles1Component implements OnInit {
  @Input() car3 : {imgUrl: string , name: string};

  constructor() { }

  ngOnInit() {
  }

}
