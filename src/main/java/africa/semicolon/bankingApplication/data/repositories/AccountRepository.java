package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.List;

public interface AccountRepository {

    Account save(Account account);
    Account findByAccountId(String id);
    void delete(Account account);
    void delete(String id);
    List<Account> findAll();
}
