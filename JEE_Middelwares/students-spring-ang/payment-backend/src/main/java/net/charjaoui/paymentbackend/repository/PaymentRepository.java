package net.charjaoui.paymentbackend.repository;

import net.charjaoui.paymentbackend.entities.Payment;
import net.charjaoui.paymentbackend.enums.PaymentStatus;
import net.charjaoui.paymentbackend.enums.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByStudentCode(String code);

    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);

}