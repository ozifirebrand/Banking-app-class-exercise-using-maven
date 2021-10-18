package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;

public interface AccountRepository {
    Account save(Account account);

    Account findByCustomerId(String customerId);

    void delete(Account account);
}
