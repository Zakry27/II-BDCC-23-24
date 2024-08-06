package net.charjaoui.ebankingbackend.repositories;

import net.charjaoui.ebankingbackend.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    List<BankAccount> findByCustomerId(Long customerId);

}