package com.extrade.storemanagement.repositories;

import com.extrade.storemanagement.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
