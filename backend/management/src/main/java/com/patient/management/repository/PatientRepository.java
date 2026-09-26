package com.patient.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.management.model.Patients;

public interface PatientRepository extends JpaRepository<Patients, Long> {
    
}
