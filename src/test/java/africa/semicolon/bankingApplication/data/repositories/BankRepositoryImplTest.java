package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankRepositoryImplTest {
    BankRepository bankRepository;
    @BeforeEach
    public void setUp(){
        bankRepository = new BankRepositoryImpl();
    }

    @Test
    public void testSave(){
        Bank bank = new Bank();
        bank.setId("8594393");
        bank.setName("GtCo");
        assertEquals(bank, bankRepository.save(bank));
    }

    @Test
    public void test_findBankById(){
        Bank bank = new Bank();
        bank.setId("8594393");
        bank.setName("GtCo");
        Bank foundBank = bankRepository.save(bank);
        assertEquals(foundBank, bankRepository.findBankById("8594393"));
    }

    @Test
    public void test_deleteBank(){
        Bank bank = new Bank();
        bank.setId("8594393");
        bank.setName("GtCo");
        bankRepository.save(bank);
        bankRepository.delete(bank);
        assertNull(bankRepository.findBankById("8594393"));
    }

    @Test
    public void test_deleteById(){
        Bank bank = new Bank();
        bank.setName("GTCo");
        bank.setId("584974");
        bankRepository.save(bank);
        bankRepository.deleteById("584974");
        assertNull(bankRepository.findBankById("584974"));
    }

    @Test
    public void test_findAll(){
        Bank bank = new Bank();
        bank.setName("GTCo");
        bank.setId("584974");
        bankRepository.save(bank);
        bankRepository.save(bank);
        bankRepository.save(bank);
        bankRepository.save(bank);
        assertEquals(4, bankRepository.findAll().size());
    }

}