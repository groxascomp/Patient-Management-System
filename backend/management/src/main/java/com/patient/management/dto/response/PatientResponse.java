package com.patient.management.dto.response;

public class PatientResponse {
    private Long idPatient;
    private String namePatient;
    private String emailPatient;
    private String addressPatient;
    private String bdayPatient;
    private String registeredDatePatient;


    public PatientResponse (){}

    public PatientResponse(Long idPatient, String namePatient, String emailPatient, String addressPatient, String bdayPatient, String registeredDatePatient){
        this.idPatient = idPatient;
        this.namePatient = namePatient;
        this.emailPatient = emailPatient;
        this.addressPatient = addressPatient;
        this.bdayPatient = bdayPatient;
        this.registeredDatePatient = registeredDatePatient;

    }

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
