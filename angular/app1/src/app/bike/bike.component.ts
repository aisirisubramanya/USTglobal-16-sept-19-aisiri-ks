import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      name : 'BMW',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      des : 'Model : 1945',
      des1 : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      name : 'Bugati',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
      des : 'Model : 2015',
      des1 : 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.'
    },
    {
      name : 'RE Classic 350',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      des : 'Model : 2019',
      des1 : 'The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.'
    },
    {
      name : 'Mercedes-Benz E-Class',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/07/17/05/45/harley-2511451__340.jpg',
      des : 'Model : 2015',
      des1 : 'The Mercedes-Benz E-Class has 2 Diesel Engine and 2 Petrol Engine on offer. ... Depending upon the variant and fuel type the E-Class has a mileage of 10.98 to 18.0 kmpl. The E-Class is a 5 seater Sedan and has a length of 4988mm, width of 1907mm and a wheelbase of 2939mm.'
    }
  ]


  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    this.selectedCar = car;
    console.log(car);
  }


}
