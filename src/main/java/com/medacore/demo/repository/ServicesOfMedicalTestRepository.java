package com.medacore.demo.repository;

import com.medacore.demo.model.ServicesOfMedicalTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicesOfMedicalTestRepository extends JpaRepository<ServicesOfMedicalTest, Integer> {
    List<ServicesOfMedicalTest> findByMedicalTest_Id(Integer medicalTestId);
}
