package com.extrade.storemanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "city")
@Data
public class City {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    @Column(name = "city_nm")
    private String cityName;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "last_modified_dt")
    private LocalDateTime lastModifiedDate;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
}
