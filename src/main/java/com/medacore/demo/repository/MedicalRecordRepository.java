package com.medacore.demo.repository;

import com.medacore.demo.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {
    List<MedicalRecord> findByStaff_Account_Username(String doctorUsername);

    List<MedicalRecord> findByPatient_Account_Username(String patientUsername);
}
