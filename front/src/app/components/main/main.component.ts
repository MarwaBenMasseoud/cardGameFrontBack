import {Component, OnInit} from '@angular/core';
import {MainService} from "../../shared/service/main.service";
import {Carte} from "../../shared/model/Carte";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  cartes!: Carte[];
  cartesTriee!: Carte[];
  constructor(private mainService: MainService) {
  }

  ngOnInit(): void {
  }

  public afficherMain(): void {
    this.mainService.getMainNonTriee().subscribe(
      (resp: Carte[]) => {
        this.cartes = resp;
      }
    )
  }

  public trieeMain(): void {
    this.mainService.getMainTriee().subscribe(
      (resp: Carte[]) => {
        this.cartesTriee = resp;
      }
    )
  }
}
