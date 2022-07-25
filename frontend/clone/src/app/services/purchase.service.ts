import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Shopping } from '../model/shopping.model';

@Injectable({
  providedIn: 'root'
})
export class PurchaseService {

  constructor(
    private http:HttpClient
  ) { }

  private baseUrl = 'http://localhost:8082/ShoppingApi/';

  getPurchase(id:number):Observable<Shopping>{
    return this.http.get<Shopping>(`${this.baseUrl}${id}`);
  }
}
