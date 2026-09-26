package com.patient.management.service;

import java.util.List;

import com.patient.management.dto.request.PatientRequest;
import com.patient.management.dto.response.PatientResponse;

public interface PatientService {
    //Get All patients record
    List<PatientResponse> getAllPatients();

   //Adding Patient
   PatientResponse addingPatient(PatientRequest request); 

   //Deleting Patient
   void deletePatient(Long id);

   //Update Patient
   PatientResponse updatingPatient(Long id, PatientRequest request);
    
} 
