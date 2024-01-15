package com.thisispawann.springbootcrud.service;

import com.thisispawann.springbootcrud.entity.Patient;
import com.thisispawann.springbootcrud.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    // this repository will talk with patient repository

    // create an object of patietn repository and inject with @Autowired

    @Autowired
    private PatientRepository patientRepository;

    // create all the CRUD functions

    // for post
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> savePatient(List<Patient> patients) {
        return patientRepository.saveAll(patients);
    }


    // for get
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(int id) {
        return patientRepository.findById(id).orElse(null);
    }

    // find by patient name
    public Patient getPatientByName(String name){
        return patientRepository.findByName(name);
    }

    // delete
    public String deletePatient(int id){
        patientRepository.deleteById(id);
        return "Patient Record "+id+" Deleted Successfully!";
    }

    // update
//    public Patient updatePatient(Patient patient){
//        Patient existingPatient = patientRepository.findById(patient.getId().orElse(null));
//        existingPatient.setName(patient.getName());
//        existingPatient.setAge(patient.getAge());
//        existingPatient.setDisease(patient.getDisease());
//        return patientRepository.save(existingPatient);
//        }
}
