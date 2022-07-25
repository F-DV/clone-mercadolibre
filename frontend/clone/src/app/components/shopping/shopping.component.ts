import { Component, OnInit } from '@angular/core';
import { ShoppingServiceService } from 'src/app/services/shopping-service.service';
import { Shopping } from 'src/app/model/shopping.model';

@Component({
  selector: 'app-shopping',
  templateUrl: './shopping.component.html',
  styleUrls: ['./shopping.component.css']
})
export class ShoppingComponent implements OnInit {

  constructor(
    private shoppingService:ShoppingServiceService
  ) { }

  ngOnInit(): void {
    this.getShopping();
   }
  shoppingList: Shopping[] = [];

  optionsFilter:Shopping[] = [{
    id: 0,
    name: "",
    amount:0,
    customerName:""}];

  shoppingChosen: Shopping ={
    id: 0,
    name: "",
    amount:0,
    customerName:""
  };
  idSearched = 0;

  getShopping(){
    this.shoppingService
    .getShopping()
    .subscribe(data => {
      this.shoppingList = data;
      this.optionsFilter = data;
    })
  }
}


