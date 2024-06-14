package com.extrade.storemanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "store_service_area")
@Data
public class StoreServiceArea {
    @Id
    @Column(name="store_service_area_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeServiceAreaId;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @ManyToOne
    @JoinColumn(name = "service_area_id")
    private ServiceArea serviceArea;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "last_modified_dt")
    private LocalDateTime lastModifiedDate;
}
