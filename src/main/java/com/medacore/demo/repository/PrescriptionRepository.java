package com.medacore.demo.repository;

import com.medacore.demo.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    Optional<Prescription> findByMedicalRecord_Id(Integer medicalRecordId);
}
