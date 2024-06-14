package com.extrade.storemanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="state")
@Data
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="state_id")
    private int stateId;
    @Column(name="state_nm")
    private String stateName;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "last_modified_dt")
    private LocalDateTime lastModifiedDate;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;
}
