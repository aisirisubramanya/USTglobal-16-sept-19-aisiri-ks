import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class StockService {

  constructor(public http: HttpClient, private route: Router) { }

  addProducts(form){
    var response;
    return this.http.post<any>(`localhost:8083/stockmanagementsystem/addproduct`,form).subscribe(data=>{
      console.log("data is added",data)
      console.log(response);
    },err=>{
      console.log("data is not added")
    }, ()=>{
      console.log("data")
    })
  }

  getAllProducts(){
    return this.http.get<any>(`localhost:8083/stockmanagementsystem/get-allproducts`)
  }

}
