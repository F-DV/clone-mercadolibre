import { Component, OnInit } from '@angular/core';
import { Shopping } from 'src/app/model/shopping.model';
import { ShoppingServiceService } from 'src/app/services/shopping-service.service';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {

  constructor(
    private shoppingService:ShoppingServiceService
  ) { }

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
  }

  idSearched:number = this.shoppingChosen.id;

  ngOnInit(): void {
    this.getShopping();
  }

  getShopping(){
    this.shoppingService
    .getShopping()
    .subscribe(data => {
      this.shoppingList = data;
      this.optionsFilter = data;
    })
  }

}
