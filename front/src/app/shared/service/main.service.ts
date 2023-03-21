import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Carte} from "../model/Carte";

@Injectable({
  providedIn: 'root'
})
export class MainService {

  API_URL = 'http://localhost:8080/';

  constructor(private httpClient: HttpClient) {
  }


  public getMainNonTriee(): Observable<Carte[]> {
    return this.httpClient.get<Carte[]>(this.API_URL + 'main');
  }

  public getMainTriee(): Observable<Carte[]> {
    return this.httpClient.get<Carte[]>(this.API_URL + 'mainTriee');
  }
}
