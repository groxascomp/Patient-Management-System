package com.patient.management.exception;

public class PatientNotFound extends RuntimeException{
    public PatientNotFound(Long id){
        super("Patient with ID " + id +  " not found");
    }
}
