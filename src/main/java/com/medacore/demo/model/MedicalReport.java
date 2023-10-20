package com.medacore.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "medical_reports")
@Data
public class MedicalReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "time")
    private LocalDateTime time;
    @Column(name = "description")
    private String description;
    @Column(name = "unit_price")
    private Float unitPrice;
    @Column(name = "total_price")
    private Float totalPrice;
    @ManyToOne
    @JoinColumn(name = "medical_record_id")
    private MedicalRecord medicalRecord;
}
