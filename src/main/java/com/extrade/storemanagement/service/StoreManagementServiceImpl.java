package com.extrade.storemanagement.service;

import com.extrade.storemanagement.dto.CityDto;
import com.extrade.storemanagement.dto.StoreDto;
import com.extrade.storemanagement.repositories.StoreServiceAreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreManagementServiceImpl implements StoreManagementService {
    private final StoreServiceAreaRepository storeServiceAreaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<StoreDto> getStoresByCityId(int cityId) {
        return storeServiceAreaRepository.findByCityId(cityId).stream().map(StoreDto::from).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> getCitiesWithStores() {
        return storeServiceAreaRepository.findCitiesWithStore().stream().map(CityDto::from).toList();
    }
}
