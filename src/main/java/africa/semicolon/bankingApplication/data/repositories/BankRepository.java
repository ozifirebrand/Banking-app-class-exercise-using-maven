package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.List;

public interface BankRepository {
    Account saveAccount(Account account);
    Account findAccountById(String id);
    List<Account> findAll();
    void delete(String id);
    void delete(Account account);


}
