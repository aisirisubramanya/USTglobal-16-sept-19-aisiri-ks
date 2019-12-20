import { Component, OnInit } from '@angular/core';
import { StockService } from '../stock.service';

@Component({
  selector: 'app-display-product',
  templateUrl: './display-product.component.html',
  styleUrls: ['./display-product.component.css']
})
export class DisplayProductComponent implements OnInit {


  product:any;

  constructor(private service: StockService) { }

  ngOnInit() {
  }

  getProducts(){ 
    this.service.getAllProducts().subscribe(data=>{
   console.log("product are",data.productBeans);
   this.product =data.productBeans;
   console.log("my product",this.product);
 }, err=>{
   console.log("error");
 }, ()=>{
   console.log("data got")
 })

  }

}
