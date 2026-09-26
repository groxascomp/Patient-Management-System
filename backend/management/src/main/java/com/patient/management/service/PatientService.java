package com.patient.management.service;

import java.util.List;

import com.patient.management.dto.response.PatientResponse;

public interface PatientService {
    //Get All patients record
    List<PatientResponse> getAllPatients();
    
} 
