package net.charjaoui.patientsmvc;

import net.charjaoui.patientsmvc.entities.Patient;
import net.charjaoui.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PatientsMvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {
            List<String> patientsNames = List.of(
                    "Ahmed", "Mohamed", "Fatima", "Hassan", "Aicha", "Omar", "Nadia", "Khalid", "Karim", "Sara",
                    "Nora", "Youssef", "Samira", "Mehdi", "Hanae", "Rachid", "Nawal", "Abdellah", "Naima", "Younes"
            );
            patientsNames.forEach(name -> {
                Patient patient = new Patient();
                patient.setName(name);
                patient.setBirthdate(new Date());
                patient.setSick(Math.random() > 0.5);
                patient.setScore((int) (Math.random() * 100 + 10));
                patientRepository.save(patient);
            });
        };
    }
}