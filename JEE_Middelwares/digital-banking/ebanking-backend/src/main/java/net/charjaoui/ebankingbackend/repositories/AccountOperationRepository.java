package net.charjaoui.ebankingbackend.repositories;

import net.charjaoui.ebankingbackend.models.AccountOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
    List<AccountOperation> findByAccountId(String accountId);
    Page<AccountOperation> findByAccountId(String accountId, Pageable pageable);
}