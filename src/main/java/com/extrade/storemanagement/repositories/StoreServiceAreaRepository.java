package com.extrade.storemanagement.repositories;

import com.extrade.storemanagement.entities.City;
import com.extrade.storemanagement.entities.StoreServiceArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StoreServiceAreaRepository extends JpaRepository<StoreServiceArea, Integer> {
    @Query("select ssa from StoreServiceArea ssa where ssa.serviceArea.city.cityId = :cityId")
    List<StoreServiceArea> findByCityId(@Param("cityId") int cityId);

    @Query("select distinct ssa.serviceArea.city from StoreServiceArea ssa order by ssa.serviceArea.city.cityName")
    List<City> findCitiesWithStore();
}
