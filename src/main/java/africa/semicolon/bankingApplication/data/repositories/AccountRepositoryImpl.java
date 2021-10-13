package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl implements AccountRepository{

    @Override
    public Account save(Account account) {
        return account;
    }

    @Override
    public Account findByAccountId(String id) {
        return null;
    }

    @Override
    public void delete(Account account) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
