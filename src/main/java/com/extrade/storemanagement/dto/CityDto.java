package com.extrade.storemanagement.dto;

import com.extrade.storemanagement.entities.City;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class CityDto {
    private int cityId;
    private String cityName;

    public static CityDto from(City city) {
        return CityDto.of().cityId(city.getCityId()).cityName(city.getCityName()).build();
    }
}
