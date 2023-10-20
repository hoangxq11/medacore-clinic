package com.medacore.demo.web.rest;

import com.medacore.demo.service.MedicalTestService;
import com.medacore.demo.web.dto.request.MedicalTestReq;
import com.medacore.demo.web.dto.response.utils.ResponseUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medical-test")
@CrossOrigin("*")
@RequiredArgsConstructor
public class MedicalTestResource {
    private final MedicalTestService medicalTestService;

    @PostMapping
    public ResponseEntity<?> createMedicalTest(@RequestBody MedicalTestReq medicalTestReq) {
        medicalTestService.createMedicalTest(medicalTestReq);
        return ResponseUtils.ok("Created");
    }

    @GetMapping("/get-by-medical-record/{medicalRecordId}")
    public ResponseEntity<?> getByMedicalRecord(@PathVariable Integer medicalRecordId) {
        return ResponseUtils.ok(medicalTestService.getByMedicalRecord(medicalRecordId));
    }

}
