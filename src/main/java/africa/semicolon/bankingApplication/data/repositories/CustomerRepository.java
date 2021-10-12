package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.List;

public interface CustomerRepository {
    //most repository implementations of the save method return alongside taking in values
    Customer save(Customer customer);
    Customer findByCustomerId(String id);
    void delete(Customer customer);
    void delete(String id);
    List<Customer> findAll();
}
