package com.extrade.storemanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "store")
@Data
public class Store {
    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;
    @Column(name = "registered_business_nm")
    private String registeredBusinessName;
    @Column(name = "franchise_owner_nm")
    private String franchiseOwnerName;
    @Column(name = "owner_contact_no")
    private String ownerContactNo;
    @Column(name = "owner_email_address")
    private String ownerEmailAddress;
    @Column(name = "store_contact_no")
    private String storeContactNo;
    @Column(name = "store_email_address")
    private String storeEmailAddress;
    @Column(name = "store_established_dt")
    private LocalDate establishedDate;
    @Column(name = "open_hours")
    private LocalTime openHours;
    @Column(name = "closing_hours")
    private LocalTime closingHours;
    @Column(name = "address_line_1")
    private String addressLine1;
    @Column(name = "address_line_2")
    private String addressLine2;
    private String city;
    private String state;
    private int zip;
    private String country;
    private String status;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "last_modified_dt")
    private LocalDateTime lastModifiedDate;

}
