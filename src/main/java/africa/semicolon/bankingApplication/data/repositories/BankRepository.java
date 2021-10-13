package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.List;

public interface BankRepository {
    Bank saveBank(Bank bank);
    Bank findBankById(String id);
    List<Bank> findAll();
    void delete(String id);
    void delete(Bank account);


}
