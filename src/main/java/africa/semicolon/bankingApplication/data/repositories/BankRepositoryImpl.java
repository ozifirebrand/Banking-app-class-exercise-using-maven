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
        for (Account account: accounts){
            if ( id.equals(account.getCustomerId()) ){
                return account;
            }
        }
        return null ;
    }

    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public void delete(String id) {
        accounts.remove(findAccountById(id));
    }

    @Override
    public void delete(Account account) {
        accounts.remove(account);
    }
}
