package com.patient.management.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.management.dto.request.PatientRequest;
import com.patient.management.dto.response.PatientResponse;
import com.patient.management.model.Patients;
import com.patient.management.repository.PatientRepository;
import com.patient.management.service.PatientService;


@Service 
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


    @Override 
    public PatientResponse addingPatient(PatientRequest request){
        Patients patients = new Patients();
        patients.setNamePatient(request.getNamePatient());
        patients.setEmailPatient(request.getEmailPatient());
        patients.setAddressPatient(request.getAddressPatient());
        patients.setBdayPatient(request.getBdayPatient());
        patients.setRegisteredDatePatient(request.getRegisteredDatePatient());

        Patients savedPatient = patientRepository.save(patients);


        PatientResponse dto = new PatientResponse();
        dto.setIdPatient(savedPatient.getIdPatient());
        dto.setNamePatient(savedPatient.getNamePatient());
        dto.setEmailPatient(savedPatient.getEmailPatient());
        dto.setAddressPatient(savedPatient.getAddressPatient());
        dto.setBdayPatient(savedPatient.getBdayPatient());
        dto.setRegisteredDatePatient(savedPatient.getRegisteredDatePatient());

        return dto;
    } 



}
