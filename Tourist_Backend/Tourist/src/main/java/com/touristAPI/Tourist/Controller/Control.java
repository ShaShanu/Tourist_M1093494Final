package com.touristAPI.Tourist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.touristAPI.Tourist.Entity.Tourist;
import com.touristAPI.Tourist.Service.TouristInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/tourist")
public class Control {
	
	@Autowired
	private TouristInterface ti;
	
	@GetMapping("/get")
	public List<Tourist> getTourist(){
		return this.ti.getTourist();
	}
	
	@PostMapping("/set")
	public Tourist addTourist(@RequestBody Tourist tourist) {
		return this.ti.addTourist(tourist);
	}
}
