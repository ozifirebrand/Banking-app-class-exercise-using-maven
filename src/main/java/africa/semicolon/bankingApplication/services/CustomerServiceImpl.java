package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    List<Customer> customers = new ArrayList<>();
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public String createAccount(String firstName, String lastName) {
        return null;
    }

    @Override
    public String createAccount(String firstName, String lastName, String bvn) {
        return null;
    }
}
