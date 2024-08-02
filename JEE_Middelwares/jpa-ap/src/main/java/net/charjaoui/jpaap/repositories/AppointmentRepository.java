package net.charjaoui.jpaap.repositories;

import net.charjaoui.jpaap.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {
}
