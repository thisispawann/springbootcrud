package com.thisispawann.springbootcrud.repository;

import com.thisispawann.springbootcrud.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Patient findByName(String name);
}
