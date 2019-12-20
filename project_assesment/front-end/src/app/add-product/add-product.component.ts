import { Component, OnInit } from '@angular/core';
import { StockService } from '../stock.service';
import { FormGroup, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private service: StockService) { }

  get name(){
    return this.form.get("name");
  }
  get category(){
    return this.form.get("category");
  }
  get company(){
    return this.form.get("company");
  }
  get quantity(){
    return this.form.get("quantity");
  }
  get price(){
    return this.form.get("price");
  }


form=new FormGroup({
  name : new FormControl('', [Validators.required]),
  category : new FormControl('',[Validators.required]),
  company : new FormControl('',[Validators.required]),
  quantity : new FormControl('',[Validators.required]),
  price : new FormControl('',[Validators.required])
})

  ngOnInit() {
  }
addProduct(form){
  this.service.addProducts(form.value);
  console.log(form.value);
  form.reset();
}


}
