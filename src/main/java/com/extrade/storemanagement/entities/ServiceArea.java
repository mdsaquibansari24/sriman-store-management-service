package com.extrade.storemanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "service_areas")
@Data
public class ServiceArea {
    @Id
    @Column(name = "service_area_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceAreaId;
    @Column(name = "area_nm")
    private String areaName;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "last_modified_dt")
    private LocalDateTime lastModifiedDate;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
