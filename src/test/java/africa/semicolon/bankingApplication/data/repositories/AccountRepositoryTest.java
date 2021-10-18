package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.AccountType;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountRepositoryTest {
    AccountRepository accountRepository;
    @BeforeEach
    public void setUp(){
        accountRepository = new AccountRepositoryImpl();
    }
    @Test
    public void test_saveAccount(){
        Account account = new Account();
        account.setAccountNumber("348390284");
        account.setCustomerId("84992");
        account.setAccountType(AccountType.SAVINGS);
        Account savedAccount = accountRepository.save(account);
        assertEquals(account, savedAccount);
    }

    @Test
    public void test_findAccountById(){
        Account account = new Account();
        account.setAccountNumber("348390284");
        account.setCustomerId("84992");
        account.setAccountType(AccountType.SAVINGS);
        Account savedAccount = accountRepository.save(account);
        Account foundAccount = accountRepository.findByCustomerId("84992");
        assertEquals(foundAccount, account);
    }

    @Test
    public void test_delete(){
        Account account = new Account();
        account.setAccountNumber("348390284");
        account.setCustomerId("84992");
        account.setAccountType(AccountType.SAVINGS);
        accountRepository.save(account);
        assertNotNull(accountRepository.findByCustomerId("84992"));
        accountRepository.delete(account);
        assertNull(accountRepository.findByCustomerId("84992"));
    }
}

    /*mvcs ie. models views/facade controllers and services
models interact with the repositories
 */
