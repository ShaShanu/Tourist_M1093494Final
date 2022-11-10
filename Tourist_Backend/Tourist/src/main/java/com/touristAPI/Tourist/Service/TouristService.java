package com.touristAPI.Tourist.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.touristAPI.Tourist.Entity.Tourist;
import com.touristAPI.Tourist.Reposatory.TouristDao;

@Service
public class TouristService implements TouristInterface{

	@Autowired
	private TouristDao Td;
	
	

	@Override
	public List<Tourist> getTourist() {
		return Td.findAll();
	}

	@Override
	public Tourist addTourist(Tourist tourist) {
		Td.save(tourist);
		return tourist;
	}

	
	public TouristService(TouristDao ttd) {
		// TODO Auto-generated method stub
		this.Td = ttd;
	}
}
