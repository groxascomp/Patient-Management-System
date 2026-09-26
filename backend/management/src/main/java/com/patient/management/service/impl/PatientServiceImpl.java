package com.patient.management.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.patient.management.dto.response.PatientResponse;
import com.patient.management.repository.PatientRepository;
import com.patient.management.service.PatientService;

public class PatientServiceImpl implements PatientService {
    
     
    @Autowired 
    private PatientRepository patientRepository;


    @Override 
    public List<PatientResponse> getAllPatients(){
        return patientRepository.findAll()
            .stream()
            .map(patient -> new PatientResponse(
                patient.getIdPatient(),
                patient.getNamePatient(),
                patient.getEmailPatient(),
                patient.getAddressPatient(),
                patient.getBdayPatient(),
                patient.getRegisteredDatePatient()
            ))
            .collect(Collectors.toList());

    }



}
