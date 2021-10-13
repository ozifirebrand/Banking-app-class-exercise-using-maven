package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.List;

public interface BvnRepository {
    Customer save(Customer customer);
    Customer findById(String id);
    void deleteById(String id);
    void delete(Customer customer);
    List<Customer> findAll();
}