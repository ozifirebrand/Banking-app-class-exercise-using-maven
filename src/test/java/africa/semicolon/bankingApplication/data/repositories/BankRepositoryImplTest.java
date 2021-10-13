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
        bankRepository.saveAccount(account);
        account.setCustomerId("5943803");
        account.setAccountNumber("443920458");
        account.setAccountType(AccountType.SAVINGS);
        assertEquals(account, bankRepository.findAccountById("5943803"));
    }

    @Test
    void findAll() {
        account.setCustomerId("5943803");
        account.setAccountNumber("443920458");
        account.setAccountType(AccountType.SAVINGS);
        bankRepository.saveAccount(account);
        bankRepository.saveAccount(account);
        bankRepository.saveAccount(account);
        bankRepository.saveAccount(account);
        assertEquals(4, bankRepository.findAll().size());
    }

    @Test
    void delete() {
        account.setCustomerId("5943803");
        account.setAccountNumber("443920458");
        account.setAccountType(AccountType.SAVINGS);
        bankRepository.saveAccount(account);
        bankRepository.delete(account);
        assertNull(bankRepository.findAccountById("5943803"));
    }

    @Test
    void testDeleteById() {
        account.setCustomerId("5943803");
        account.setAccountNumber("443920458");
        account.setAccountType(AccountType.SAVINGS);
        bankRepository.saveAccount(account);
        bankRepository.delete("5943803");
        assertNull(bankRepository.findAccountById("5943803"));

    }
}