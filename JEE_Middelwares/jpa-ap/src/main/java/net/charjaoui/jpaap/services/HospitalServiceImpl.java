package net.charjaoui.jpaap.services;

import jakarta.transaction.Transactional;
import net.charjaoui.jpaap.entities.Appointment;
import net.charjaoui.jpaap.entities.Consultation;
import net.charjaoui.jpaap.entities.Doctor;
import net.charjaoui.jpaap.entities.Patient;
import net.charjaoui.jpaap.repositories.AppointmentRepository;
import net.charjaoui.jpaap.repositories.ConsultationRepository;
import net.charjaoui.jpaap.repositories.DoctorRepository;
import net.charjaoui.jpaap.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    PatientRepository patientRepository;
    DoctorRepository doctorRepository;
    AppointmentRepository appointmentRepository;
    ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, DoctorRepository doctorRepository, AppointmentRepository appointmentRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
        this.appointmentRepository = appointmentRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        appointment.setId(UUID.randomUUID().toString());
        return appointmentRepository.save(appointment);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}