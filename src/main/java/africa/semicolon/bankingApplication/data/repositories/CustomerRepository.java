package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer save(Customer customer);
    Customer findById(String customerId);
    void delete(Customer customer);
    void delete(String customerId);
    List<Customer> findAll();
}
