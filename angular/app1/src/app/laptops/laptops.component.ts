import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  selectedCar1;
  Cars1 = [
    {
      name : 'Dell',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/08/10/07/32/dell-2619501__340.jpg',
      des : 'Rs : 34000',
      des1 : 'Dell 15 7000 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.'
    },
    {
      name : 'Dell Desktop',
      imgUrl : 'https://image.shutterstock.com/image-vector/desktop-pc-blank-screen-perspective-260nw-778939729.jpg',
      des : 'Rs : 25666',
      des1 : 'Dell Desktop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'Motorola',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/09/07/05/41/surface-book-3660000__340.jpg',
      des : 'Rs : 12333',
      des1 : 'Motorola Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'Microsoft surface pro 4',
      imgUrl : 'https://cdn.pixabay.com/photo/2019/06/15/09/26/laptop-4275110__340.jpg',
      des : 'Rs : 74099',
      des1 : 'CPU: 2.4GHz Intel Core i5-6300U (dual-core, 3MB cache, up to 3GHz with Turbo Boost) Graphics: Intel HD Graphics 520. RAM: 8GB LPDDR3. Screen: 12.3-inch, 2,736 x 1,824 PixelSense display (Contrast ratio: 1,300:1, 100% sRGB color, 10-point multi-touch, 3:2 aspect ratio) Storage: 256GB SSD (PCIe 3.0)'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    this.selectedCar1 = car;
    console.log(car);
  }

}
