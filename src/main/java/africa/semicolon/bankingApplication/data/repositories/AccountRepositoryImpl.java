package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl implements AccountRepository {
    private final List<Account> accounts = new ArrayList<>();
    @Override
    public Account save(Account account) {
        accounts.add(account);
        return account ;
    }

    @Override
    public Account findByCustomerId(String customerId) {
        for (Account account: accounts){
            if ( account.getCustomerId().equalsIgnoreCase(customerId) ){
                return account;
            }
        }
        return null ;
    }

    @Override
    public void delete(Account account) {
        accounts.remove(account);
    }
}
