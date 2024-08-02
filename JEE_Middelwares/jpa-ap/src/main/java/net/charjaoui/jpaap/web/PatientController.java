package net.charjaoui.jpaap.web;

import net.charjaoui.jpaap.entities.Patient;
import net.charjaoui.jpaap.repositories.PatientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping("/patients")
    public List<Patient> patients() {
        return this.patientRepository.findAll();
    }
}