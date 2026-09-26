package com.patient.management.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="patients")
public class Patients {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_patient")
    private Long idPatient;

    @Column (name="name_patient")
    private String namePatient;

    @Column (name="email_patient")
    private String emailPatient;

    @Column (name="address_patient")
    private String addressPatient;

    @Column (name="bday_patient")
    private String bdayPatient;

    @Column (name="registered_date_patient")
    private String registeredDatePatient;


    public Long getIdPatient() {
    return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getEmailPatient() {
        return emailPatient;
    }

    public void setEmailPatient(String emailPatient) {
        this.emailPatient = emailPatient;
    }

    public String getAddressPatient() {
        return addressPatient;
    }

    public void setAddressPatient(String addressPatient) {
        this.addressPatient = addressPatient;
    }

    public String getBdayPatient() {
        return bdayPatient;
    }

    public void setBdayPatient(String bdayPatient) {
        this.bdayPatient = bdayPatient;
    }

    public String getRegisteredDatePatient() {
        return registeredDatePatient;
    }

    public void setRegisteredDatePatient(String registeredDatePatient) {
        this.registeredDatePatient = registeredDatePatient;
    }




}

