package com.extrade.storemanagement.dto;

import com.extrade.storemanagement.entities.StoreServiceArea;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class StoreDto {
    private int storeId;
    private String registeredBusinessName;
    private String storeContactNo;
    private String storeEmailAddress;
    private String storeAreaName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int zip;
    private String country;

    public static StoreDto from(StoreServiceArea storeServiceArea) {
        return StoreDto.of().storeId(storeServiceArea.getStore().getStoreId()).registeredBusinessName(storeServiceArea.getStore().getRegisteredBusinessName())
                .storeContactNo(storeServiceArea.getStore().getStoreContactNo())
                .storeEmailAddress(storeServiceArea.getStore().getStoreEmailAddress())
                .storeAreaName(storeServiceArea.getServiceArea().getAreaName())
                .addressLine1(storeServiceArea.getStore().getAddressLine1())
                .addressLine2(storeServiceArea.getStore().getAddressLine2())
                .city(storeServiceArea.getStore().getCity())
                .state(storeServiceArea.getStore().getState())
                .zip(storeServiceArea.getStore().getZip())
                .country(storeServiceArea.getStore().getCountry()).build();
    }
}
