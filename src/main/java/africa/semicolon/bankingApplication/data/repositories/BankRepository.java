package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.List;

public interface BankRepository {
    Bank save(Bank bank);

    Bank findBankById(String bankId);

    void delete(Bank bank);

    void deleteById(String s);

    List<Bank> findAll();
}
