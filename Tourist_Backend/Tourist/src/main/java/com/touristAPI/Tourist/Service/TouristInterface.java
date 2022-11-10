package com.touristAPI.Tourist.Service;

import java.util.List;

import com.touristAPI.Tourist.Entity.Tourist;

public interface TouristInterface {

	public List<Tourist> getTourist();

	public Tourist addTourist(Tourist tourist);
	

}
