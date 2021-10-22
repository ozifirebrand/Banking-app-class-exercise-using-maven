package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    List<Customer> customers = new ArrayList<>();
    @Override
    public Customer save(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer findById(String customerId) {
        for (Customer customer : customers){
            if ( customer.getBvn().equals(customerId) )
                return customer;
        }
        return null;
    }

    @Override
    public void delete(Customer customer) {
     customers.remove(customer);
    }

    @Override
    public void delete(String customerId) {
        delete(findById(customerId));

    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
