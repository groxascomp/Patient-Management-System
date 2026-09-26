package com.patient.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patient.management.model.Patients;

@Repository 
public interface PatientRepository extends JpaRepository<Patients, Long> {
    
}
