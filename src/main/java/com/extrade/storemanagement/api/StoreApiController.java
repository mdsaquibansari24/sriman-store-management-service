package com.extrade.storemanagement.api;

import com.extrade.storemanagement.dto.CityDto;
import com.extrade.storemanagement.dto.StoreDto;
import com.extrade.storemanagement.service.StoreManagementService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8088")
public class StoreApiController {
    private final StoreManagementService storeManagementService;

    @ApiResponses(value = {@ApiResponse(responseCode = "200", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = List.class))}, description = "all cities in which stores exists")})
    @GetMapping(value = "/cities", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<CityDto> getCitiesWithStores() {
        return storeManagementService.getCitiesWithStores();
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = List.class))}, description = "all the stores in the cityName")})
    @GetMapping("/{cityId}")
    public List<StoreDto> getStoresByCityName(@PathVariable("cityId") int cityId) {
        return storeManagementService.getStoresByCityId(cityId);
    }

}
