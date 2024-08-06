package net.charjaoui.ebankingbackend.services;

import net.charjaoui.ebankingbackend.dto.*;
import net.charjaoui.ebankingbackend.exceptions.BalanceNotSufficientException;
import net.charjaoui.ebankingbackend.exceptions.BankAccountNotFoundException;
import net.charjaoui.ebankingbackend.exceptions.CustomerNotFoundException;
import net.charjaoui.ebankingbackend.models.BankAccount;
import net.charjaoui.ebankingbackend.repositories.AccountOperationRepository;

import java.util.List;

public interface BankAccountService {
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    List<BankAccountDTO> getBankAccounts();
    List<AccountOperationDTO> getAccountOperations(String accountId);
    List<BankAccountDTO> getCustomerBankAccounts(Long customerId);
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;
}