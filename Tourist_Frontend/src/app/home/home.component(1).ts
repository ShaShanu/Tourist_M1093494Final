import { Component, OnInit } from '@angular/core';
import { Tourist } from '../tourist';
import { TouristServiceService } from '../tourist-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  tourist:Tourist=new Tourist();
  constructor(private TouristService:TouristServiceService) { }
  message:boolean=false;


  ngOnInit(): void {
      }
  touristRegister(){
    console.log(this.tourist)
    this.TouristService.setTourist(this.tourist).subscribe(data=>{
      this.message=true;

    },error=>alert("Error"))
  }
}
