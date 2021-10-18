package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;

import java.util.List;

public interface AccountRepository {
    Account save(Account account);

    Account findByCustomerId(String customerId);

    void delete(Account account);

    void deleteById(String accountById);

    List<Account> findAll();
}
