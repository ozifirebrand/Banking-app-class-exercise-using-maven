package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.Collection;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    String createAccount(String firstName, String lastName);
    String createAccount(String firstName, String lastName, String bvn);
}
