package com.example.demo;

import java.util.List;

public interface PatientService {
    List<Patient> getPatients();
    Patient getPatientById(Long id);
    Patient createPatient (Patient patient);
    Patient updatePatient(Long id, Patient patient);
    void deletePatientById(Long id);
}
