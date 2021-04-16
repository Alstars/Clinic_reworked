package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(new Patient());
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Long id, Patient patient) {
        patientRepository.findById(id).ifPresent(patient1 -> {
           patient1.setId(patient.getId());
           patient1.setAdress(patient.getAdress());
           patient1.setDiagnosis(patient.getDiagnosis());
           patient1.setName(patient.getName());
           patient1.setPatronimic(patient.getPatronimic());
           patient1.setSurname(patient.getSurname());
           patient1.setStatus((patient.getStatus()));

           patientRepository.save(patient1);
       });

       return patient;
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }
}
