import { Component, OnInit,Input } from '@angular/core';
import { Shopping } from 'src/app/model/shopping.model';
import { PurchaseService } from 'src/app/services/purchase.service';

@Component({
  selector: 'app-purchase',
  templateUrl: './purchase.component.html',
  styleUrls: ['./purchase.component.css']
})
export class PurchaseComponent implements OnInit {

  @Input() set assingId(idChosen:number){
    this.idSearched = idChosen;
    this.getPurchase(idChosen);
  };

  constructor(
    private purchaseService: PurchaseService
  ) { }

  purchaseChosen: Shopping ={
    id: 0,
    name: "",
    amount:0,
    customerName:""
  }
  idSearched:number = 0;

  ngOnInit(): void {
  }

  getPurchase(id:number){
    if(id > 0){
      this.purchaseService
      .getPurchase(id)
      .subscribe(data => {
        this.purchaseChosen = data;
      })
    }
  }

}
