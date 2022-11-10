package com.touristAPI.Tourist.Service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.touristAPI.Tourist.Reposatory.TouristDao;

@ExtendWith(MockitoExtension.class)
class TouristServiceTest {

	@Mock
	TouristDao tt;
	
	TouristInterface Ts;
	
	@BeforeEach
	void set() {
		this.Ts = new TouristService(this.tt);
	}
	@Test
	void test() {
		Ts.getTourist();
		verify(tt).findAll();
	}

}
