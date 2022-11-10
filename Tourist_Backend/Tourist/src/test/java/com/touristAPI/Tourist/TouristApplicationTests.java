package com.touristAPI.Tourist;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.touristAPI.Tourist.Entity.Tourist;
import com.touristAPI.Tourist.Reposatory.TouristDao;

@SpringBootTest
class TouristApplicationTests {

	@Autowired
	TouristDao tt;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testSet() {
		Tourist t = new Tourist();
		t.setId(900);
		t.setFirstName("Shashank");
		t.setLastName("Shanu");
		t.setGender("Male");
		t.setFromPlace("Bihar"); 
		t.setAge(23);
		t.setNumberOfDaysVisit(32);
		tt.save(t);
		assertNotNull(tt.findById(900).get());
	}

}
