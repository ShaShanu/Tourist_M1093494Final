import { Component, OnInit } from '@angular/core';
import { TouristServiceService } from '../tourist-service.service';
@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  list:any;
  data:any;
  constructor(private listTourist: TouristServiceService) {
    this.listTourist.getTourist().subscribe(data=>{
      
      this.list=data;
    })
   }

  ngOnInit(): void {
  }

}
