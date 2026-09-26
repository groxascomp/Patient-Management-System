package com.patient.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @DeleteMapping ("/{id}")
    public void deletePatient(@PathVariable Long id){
        patientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public PatientResponse updatePatient(@PathVariable Long id, @RequestBody PatientRequest request) {
        return patientService.updatingPatient(id, request);
    }

    @GetMapping ("/{id}")
    public PatientResponse findByID (@PathVariable Long id){
        return patientService.findByID(id);
    }

}
