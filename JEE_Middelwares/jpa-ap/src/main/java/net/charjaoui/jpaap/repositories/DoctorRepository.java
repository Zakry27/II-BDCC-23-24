package net.charjaoui.jpaap.repositories;

import net.charjaoui.jpaap.entities.Doctor;
import net.charjaoui.jpaap.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.print.Doc;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findByName(String name);
    Doctor findByEmail(String email);
    List<Doctor> findByNameContains(String keyword);
    List<Doctor> findBySpecialty(String speciality);

}