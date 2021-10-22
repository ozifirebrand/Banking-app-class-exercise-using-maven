package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bank;
import africa.semicolon.bankingApplication.data.models.Customer;
import africa.semicolon.bankingApplication.data.repositories.BankRepository;
import africa.semicolon.bankingApplication.data.repositories.BankRepositoryImpl;
import africa.semicolon.bankingApplication.dtos.requests.CreateAccountRequest;

import java.util.List;

public class BankServicesImpl implements BankServices{
    BankRepository bankRepository = new BankRepositoryImpl();
    @Override
    public String createBank(String bankName) {
        Bank bank = generateBankId();
        bank.setName(bankName);
        Bank savedBank = bankRepository.save(bank);
        return savedBank.getId();
    }

    private Bank generateBankId() {
        int bankId = findAllBanks().size();
        Bank bank = new Bank();
        bank.setId(String.format("%02d", ++bankId));
        return bank;
    }

    @Override
    public List<Bank> findAllBanks() {
        return bankRepository.findAll();
    }

    @Override
    public String createAccount(CreateAccountRequest createAccountRequest) {
        String bankId = createAccountRequest.getBankId();
        String accountNumber = generateSuffixFor(bankId);
        Customer customer =new Customer();
        Account account = new Account();
        account.setAccountNumber(bankId+accountNumber);
        account.setAccountType(createAccountRequest.getAccountType());

        customer.setFirstName(createAccountRequest.getFirstName());
        customer.setLastName(createAccountRequest.getLastName());
        customer.getAccounts().add(account);

        Bank bank = bankRepository.findBankById(bankId);
        bank.getAccounts().add(account);
        bankRepository.save(bank);

        return account.getAccountNumber();
    }

    private String generateSuffixFor(String bankId) {
        Bank bank = bankRepository.findBankById(bankId);
        int lastNumber = bank.getAccounts().size();
        return String.format("%08d", ++lastNumber);
    }
}
