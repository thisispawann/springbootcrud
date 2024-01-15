package com.thisispawann.springbootcrud.controller;

import com.thisispawann.springbootcrud.entity.Patient;
import com.thisispawann.springbootcrud.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }

    @PostMapping("/addPatients")
    public List<Patient> addPatients(@RequestBody List<Patient> patients){
        return patientService.savePatient(patients);
    }

    @GetMapping("/patients")
    public List<Patient> findAllPatients() {
        return patientService.getPatients();
    }

    @GetMapping("/patient/{id}")
    public Patient findPatientsById(@PathVariable int id){
        return patientService.getPatientById(id);
    }

    @GetMapping("/patient/{name}")
    public Patient findPatientsByName(@PathVariable String name){
        return patientService.getPatientByName(name);
    }

    @DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable int id){
        return patientService.deletePatient(id);
    }
}
