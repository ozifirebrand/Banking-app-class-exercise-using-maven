package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplTest {
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp(){
        customerRepository = new CustomerRepositoryImpl();
    }
    @Test
    void save() {
        Customer customer = new Customer();
        customer.setBvn("58439302");
        customer.setLastName("Ekpu");
        customer.setFirstName("Anu");
        Customer savedCustomer = customerRepository.save(customer);
        assertEquals(customer, savedCustomer);
    }

    @Test
    void findById() {
        Customer customer = new Customer();
        customer.setBvn("58439302");
        customer.setLastName("Ekpu");
        customer.setFirstName("Anu");
        Customer savedCustomer = customerRepository.save(customer);
        Customer foundCustomer = customerRepository.findById(customer.getBvn());
        assertEquals(foundCustomer, savedCustomer);
    }

    @Test
    void delete() {
        Customer customer= new Customer();
        customer.setBvn("58439302");
        customer.setLastName("Ekpu");
        customer.setFirstName("Anu");
        Customer savedCustomer = customerRepository.save(customer);
        customerRepository.delete(customer);
        assertNull(customerRepository.findById(customer.getBvn()));
    }

    @Test
    void deleteById() {
        Customer customer= new Customer();
        customer.setBvn("58439302");
        customer.setLastName("Ekpu");
        customer.setFirstName("Anu");
        Customer savedCustomer = customerRepository.save(customer);
        customerRepository.delete("58439302");
        assertNull(customerRepository.findById("58439302"));
    }

    @Test
    void findAll() {
        Customer customer= new Customer();
        customer.setBvn("58439302");
        customer.setLastName("Ekpu");
        customer.setFirstName("Anu");
        Customer savedCustomer = customerRepository.save(customer);
        Customer savedCustomer4 = customerRepository.save(customer);
        Customer savedCustomer1 = customerRepository.save(customer);
        Customer savedCustomer2 = customerRepository.save(customer);
        assertEquals(4, customerRepository.findAll().size());

    }
}