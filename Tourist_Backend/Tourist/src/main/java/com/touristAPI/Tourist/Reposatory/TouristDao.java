package com.touristAPI.Tourist.Reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.touristAPI.Tourist.Entity.*;

public interface TouristDao extends JpaRepository<Tourist, Integer> {

}
