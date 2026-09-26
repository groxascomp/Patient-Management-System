package com.patient.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.management.dto.request.PatientRequest;
import com.patient.management.dto.response.PatientResponse;
import com.patient.management.service.PatientService;

@RestController 
@RequestMapping ("/patients")
public class PatientController {
    
    @Autowired 
    private PatientService patientService;


    @GetMapping 
    public List<PatientResponse> getAllPatient(){
        return patientService.getAllPatients();
    }

    @PostMapping 
    public PatientResponse addingPatient(@RequestBody PatientRequest request){
        PatientResponse response = patientService.addingPatient(request);
        return response;
    }



}
