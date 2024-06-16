package com.extrade.storemanagement.service;

import com.extrade.storemanagement.dto.CityDto;
import com.extrade.storemanagement.dto.StoreDto;

import java.util.List;

public interface StoreManagementService {
    List<StoreDto> getStoresByCityId(int cityId);
    List<CityDto> getCitiesWithStores();
}
