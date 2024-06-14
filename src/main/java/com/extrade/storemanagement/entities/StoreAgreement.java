package com.extrade.storemanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "store_agreement")
@Data
public class StoreAgreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_agreement_id")
    private int storeAgreementId;
    @Column(name = "agreement_start_dt")
    private LocalDate agreementStartDate;
    @Column(name = "agreement_end_dt")
    private LocalDate agreementEndDate;
    @Column(name = "buy_transaction_commission_percentage")
    private double buyTransactionCommissionPercentage;
    @Column(name = "sell_transaction_commission_percentage")
    private double sellTransactionCommissionPercentage;
    @Column(name = "lease_transaction_commission_percentage")
    private double leaseTransactionCommissionPercentage;
    @Column(name = "damaged_unrepairable_product_loss_percentage")
    private double damagedUnRepairableProductLossPercentage;
    @Column(name = "store_insurance_amt")
    private double storeInsuranceAmount;
    @Column(name = "billing_cycle_start_dt")
    private LocalDate billingCycleStartDate;
    @Column(name = "billing_cycle_type")
    private String billingCycleType;
    @Column(name = "due_in_days")
    private int dueInDays;
    private String status;
    @Column(name = "store_agreement_signed_file_uri")
    private URI storeAgreementSignedFileUri;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "last_modified_dt")
    private LocalDateTime lastModifiedDate;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

}
