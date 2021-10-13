package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class BvnRepositoryImpl implements BvnRepository{
    ArrayList<Customer> customers = new ArrayList<>();
    @Override
    public Customer save(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public Customer findById(String id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
