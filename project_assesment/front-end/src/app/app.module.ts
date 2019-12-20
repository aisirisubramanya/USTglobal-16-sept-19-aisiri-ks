import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddProductComponent } from './add-product/add-product.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { DisplayProductComponent } from './display-product/display-product.component';
import { DisplayOrderComponent } from './display-order/display-order.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddProductComponent,
    HomeComponent,
    DisplayProductComponent,
    DisplayOrderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'add', component : AddProductComponent},
      {path : '', component : HomeComponent},
      {path : 'display', component : DisplayProductComponent},
      {path : 'order', component : DisplayOrderComponent}
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
