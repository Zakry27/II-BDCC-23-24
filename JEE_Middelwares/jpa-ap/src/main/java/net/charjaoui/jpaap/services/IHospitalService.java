package net.charjaoui.jpaap.services;

import net.charjaoui.jpaap.entities.Appointment;
import net.charjaoui.jpaap.entities.Consultation;
import net.charjaoui.jpaap.entities.Doctor;
import net.charjaoui.jpaap.entities.Patient;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Doctor saveDoctor(Doctor doctor);

    Appointment saveAppointment(Appointment appointment);
    Consultation saveConsultation(Consultation consultation);
}