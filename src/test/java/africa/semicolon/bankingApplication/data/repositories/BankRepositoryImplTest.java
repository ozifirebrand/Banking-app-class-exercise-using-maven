package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.AccountType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankRepositoryImplTest {

    public BankRepository bankRepository;
    public Account account ;

    @BeforeEach
    void setUp() {
        bankRepository = new BankRepositoryImpl();
        account = new Account();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveAccount() {
        bankRepository.saveAccount(account);
        account.setCustomerId("5943803");
        account.setAccountNumber("443920458");
        account.setAccountType(AccountType.SAVINGS);
        assertEquals(account, bankRepository.saveAccount(account));
    }

    @Test
    void findAccountById() {


    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void testDelete() {
    }
}