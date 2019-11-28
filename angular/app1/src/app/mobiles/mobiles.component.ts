import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
   selectedCar2;
  Cars2 = [
    {
      name : 'Redmi MI4A',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/29/12/30/android-1869510__340.jpg',
      des : 'Rs : 25666',
      des1 : 'Redmi 4A X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'Samsung S6 Edge',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938__340.jpg',
      des : 'Rs : 53000',
      des1 : 'Samsung s6 edge X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'Sony',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/22/23/40/electronics-1851218__340.jpg',
      des : 'Rs : 46666',
      des1 : 'Sony Xperia M2 X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'Iphone 8',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/05/01/13/04/sport-3365503__340.jpg',
      des : 'Rs : 70999',
      des1 : 'Iphone * X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    this.selectedCar2 = car;
    console.log(car);
  }

}
