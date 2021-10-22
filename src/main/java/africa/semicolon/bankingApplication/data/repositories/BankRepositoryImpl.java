package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepositoryImpl implements BankRepository {
    List<Bank> banks = new ArrayList<>();
    @Override
    public Bank save(Bank bank) {
        banks.add(bank);
        return bank;
    }

    @Override
    public Bank findBankById(String bankId) {
        for (Bank bank : banks){
            if ( bank.getId().equals(bankId) )
                return bank;
        }
        return null;
    }

    @Override
    public void delete(Bank bank) {
        banks.remove(bank);
    }

    @Override
    public void deleteById(String bankId) {
        delete(findBankById(bankId));
    }

    @Override
    public List<Bank> findAll() {
        return banks;
    }
}
