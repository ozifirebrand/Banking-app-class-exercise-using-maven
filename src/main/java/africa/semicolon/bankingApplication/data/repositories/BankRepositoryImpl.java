package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepositoryImpl implements BankRepository{
    private List<Account> accounts = new ArrayList<>();
    @Override
    public Account saveAccount(Account account) {
        accounts.add(account);
        return account;
    }

    @Override
    public Account findAccountById(String id) {
        return null;
    }

    @Override
    public List<Bank> findAll() {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void delete(Account account) {

    }
}
