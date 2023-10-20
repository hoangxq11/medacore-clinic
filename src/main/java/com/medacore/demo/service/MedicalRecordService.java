package com.medacore.demo.service;

import com.medacore.demo.web.dto.MedicalRecordDto;
import com.medacore.demo.web.dto.MedicalRecordInfoDto;
import com.medacore.demo.web.dto.request.MedicalRecordInfoReq;
import com.medacore.demo.web.dto.request.MedicalRecordReq;

import java.util.List;

public interface MedicalRecordService {
    MedicalRecordDto getMedicalRecordById(Integer medicalRecordId);

    void createMedicalRecord(MedicalRecordReq medicalRecordReq);

    List<MedicalRecordDto> getMedicalRecords();

    void createMedicalRecordInfo(MedicalRecordInfoReq medicalRecordReq);

    List<MedicalRecordDto> getMedicalRecordsOfDoctor(String doctorUsername);

    MedicalRecordInfoDto getMedicalRecordInfo(Integer medicalRecordId);

    void updateStatus(Integer medicalRecordId, String status);

    List<MedicalRecordDto> getMedicalRecordsOfPatient(String patientUsername);

    void updatePaymentStatus(Integer medicalRecordId, String paymentStatus);
}
