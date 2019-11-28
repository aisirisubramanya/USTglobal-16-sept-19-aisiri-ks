import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { BikeComponent } from './bike/bike.component';
import { MoviesComponent } from './movies/movies.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { Mobiles1Component } from './mobiles1/mobiles1.component';
import { Laptops1Component } from './laptops1/laptops1.component';
import { Movies1Component } from './movies1/movies1.component';
import { Bike1Component } from './bike1/bike1.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BikeComponent,
    MoviesComponent,
    LaptopsComponent,
    MobilesComponent,
    Mobiles1Component,
    Laptops1Component,
    Movies1Component,
    Bike1Component
  ],
  imports: [
    BrowserModule,
    // AppRoutingModule
    RouterModule.forRoot([
      {path : 'bike' , component : BikeComponent},
      {path : 'movie' , component : MoviesComponent},
      {path : 'laptop' , component : LaptopsComponent},
      {path : 'mobile' , component : MobilesComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
