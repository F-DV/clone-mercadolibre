import { Component, OnInit } from '@angular/core';
import {Product}  from '../../model/product.model';
import { ProductServiceService } from 'src/app/services/product-service.service';
import { PurchaseService } from 'src/app/services/purchase.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products: Product[] = [];

  product: Product = {
    id: 0,
    name:"",
    price: 0,
    stock:0
  }
  constructor(
    private productService:ProductServiceService

  ) { }

  ngOnInit(): void {
    this.getProduct(1);
  }

  getProduct(id:number){
    this.productService.getProduct(id)
    .subscribe(data => {
      this.product = data;
    })

  }
  getProducts(){
    this.productService
    .getProducts()
    .subscribe(data=> {
      this.products = data;
    })
  }

  buyProduct(){
    console.log('Compro Producto');
  }

  addToCart(){
    console.log('Agregado al carrito');
  }

}
