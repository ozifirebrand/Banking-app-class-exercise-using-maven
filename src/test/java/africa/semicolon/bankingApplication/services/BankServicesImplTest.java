package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.AccountType;
import africa.semicolon.bankingApplication.dtos.requests.CreateAccountRequest;
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
        bankServices = null;
    }

    @Test
    void test_createBank() {
        String bankId = bankServices.createBank("GTCo");
        assertEquals("01", bankId);
    }

    @Test
    void test_createTwoBanks_secondBank_willBeO2_andBank3_willBe03(){
        String gtCoId  = bankServices.createBank("GT Bank");
        String firstBank = bankServices.createBank("First Bank");
        String wemaBank = bankServices.createBank("Wema Bank");
        assertEquals("01", gtCoId);
        assertEquals("02", firstBank);
        assertEquals("03", wemaBank);
    }

    @Test
    public void test_whenICreateTwoBanks_RepositoryHasTwoBanks(){
        String gtCoId  = bankServices.createBank("GT Bank");
        String firstBank = bankServices.createBank("First Bank");
        assertEquals("01", gtCoId);
        assertEquals("02", firstBank);
        assertEquals(2, bankServices.findAllBanks().size());
    }

    @Test
    public void bankCanCreateAccountForCustomer(){
        String gtCoId = bankServices.createBank("GT Co");
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        createAccountRequest.setAccountType(AccountType.CURRENT);
        createAccountRequest.setBankId("01");
        createAccountRequest.setFirstName("Mojo");
        createAccountRequest.setLastName("Lola");
        String accountNumber = bankServices.createAccount(createAccountRequest);
        assertEquals("0100000001", accountNumber);
    }

    @Test
    public void test_createTwoAccountsInBank1_accountNumberShouldBe02(){
        String gtCoId = bankServices.createBank("GT Co");
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        createAccountRequest.setAccountType(AccountType.CURRENT);
        createAccountRequest.setBankId("01");
        createAccountRequest.setFirstName("Mojo");
        createAccountRequest.setLastName("Lola");
        String firstAccountNumber = bankServices.createAccount(createAccountRequest);
        CreateAccountRequest theForm = new CreateAccountRequest();
        theForm.setAccountType(AccountType.CURRENT);
        theForm.setBankId("01");
        theForm.setFirstName("Mayowa");
        theForm.setLastName("Adun");
        String secondAccountNumber = bankServices.createAccount(theForm);
        assertEquals("0100000001", firstAccountNumber);
        assertEquals("0100000002", secondAccountNumber);
    }

    @Test
    public void createAccountsInTheTwoBanks_accountNumberShouldBeDifferentWithDifferentBank(){
        String gtCoId = bankServices.createBank("GT Co");
        String firstBank = bankServices.createBank("First Bank");
        String wemaBank = bankServices.createBank("Wema Bank");

        CreateAccountRequest jerryForm = new CreateAccountRequest();
        jerryForm.setLastName("Ifeanyi");
        jerryForm.setFirstName("Jerry");
        jerryForm.setBankId("01");
        jerryForm.setAccountType(AccountType.CURRENT);
        String jerryAccountNumber = bankServices.createAccount(jerryForm);

        CreateAccountRequest olaForm = new CreateAccountRequest();
        olaForm.setAccountType(AccountType.CURRENT);
        olaForm.setBankId("02");
        olaForm.setFirstName("Ola");
        olaForm.setLastName("Cubana");
        String olaAccountNumber = bankServices.createAccount(olaForm);

        CreateAccountRequest adesuaForm = new CreateAccountRequest();
        adesuaForm.setLastName("Odoemela");
        adesuaForm.setFirstName("Adesua");
        adesuaForm.setBankId("03");
        adesuaForm.setAccountType(AccountType.CURRENT);
        String adesuaAccountNumber = bankServices.createAccount(adesuaForm);

        assertEquals("0100000001", jerryAccountNumber);
        assertEquals("0200000001", olaAccountNumber);
        assertEquals("0300000001", adesuaAccountNumber );
    }

    @Test
    public void test_whenAccountIsCreated_customerIsCreated(){
        String gtCoId = bankServices.createBank("Gt co");

        CreateAccountRequest jerryForm = new CreateAccountRequest();
        jerryForm.setAccountType(AccountType.CURRENT);
        jerryForm.setBankId("01");
        jerryForm.setFirstName("Jerry");
        jerryForm.setLastName("Ifeanyi");
        String jerryAccountNumber = bankServices.createAccount(jerryForm);

        CustomerService customerService = new CustomerServiceImpl();

        assertEquals(1, customerService.findAll().size());
    }


}