package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.AccountType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryImplTest {
    private AccountRepository accountRepository;
    void setUp(){
        accountRepository = new AccountRepositoryImpl();
    }

    @Test
    void save() {
        AccountType accountType = AccountType.CURRENT;
        Account  account = new Account();
        account.setAccountType(accountType);
        account.setAccountNumber("6782689");
        account.setCustomerId("1145");
        Account foundAccount= accountRepository.save(account);
        assertEquals(account, foundAccount);
    }

    @Test
    void findByCustomerId() {
    }

    @Test
    void delete() {
    }

    @Test
    void testDelete() {
    }

    @Test
    void findAll() {
    }
}