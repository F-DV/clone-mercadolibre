import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../model/product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  constructor(
    private httpClient: HttpClient
  ) { }

  private baseUrl = "http://localhost:8082/api/";

  getProducts():Observable<Product[]>{
    return this.httpClient.get<Product[]>(`${this.baseUrl}products`)
  }

  getProduct(id:number):Observable<Product>{
    return this.httpClient.get<Product>(`${this.baseUrl}${id}`)
  }
}
