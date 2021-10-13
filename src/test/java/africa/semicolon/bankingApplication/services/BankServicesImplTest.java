package africa.semicolon.bankingApplication.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankServicesImplTest {

    BankServices bankServices;
    @BeforeEach
    void setUp() {
        bankServices = new BankServicesImpl();
    }

    @AfterEach
    void tearDown() {
        bankServices= null;
    }

    @Test
    void createBank() {
        String gtCoId = bankServices.createBank("GT Co");
        String firstBank = bankServices.createBank("First bank");
        assertEquals("01", gtCoId);
        assertEquals("02", firstBank);
    }
}