package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplTest {

    private CustomerRepository customerRepository;
    @BeforeEach
    void setUp() {
        customerRepository = new CustomerRepositoryImpl();
    }

    @Test
    void save() {
        Customer customer = new Customer();
        customer.setFirstName("Mary");
        customer.setLastName("Seyi");
        customer.setBvn("675368996");
        Customer savedCustomer = customerRepository.save(customer);
        assertEquals(customer, savedCustomer);
    }

    @Test
    void findByCustomerId() {
        Customer customer = new Customer();
        customer.setBvn("675368996");
        customer.setFirstName("Mary");
        customer.setLastName("Seyi");
        customerRepository.save(customer);
        Customer foundCustomer = customerRepository.findByCustomerId("675368996");
        assertEquals(customer, foundCustomer);
    }

    @Test
    void delete() {
        Customer customer = new Customer();
        customer.setBvn("675368996");
        customer.setFirstName("Mary");
        customer.setLastName("Seyi");
        customerRepository.save(customer);
        assertNotNull(customerRepository.findByCustomerId("675368996"));
        customerRepository.delete(customer);
        assertNull(customerRepository.findByCustomerId("675368996"));

    }

    @Test
    void testDeleteById() {
        Customer customer = new Customer();
        customer.setBvn("675368996");
        customer.setFirstName("Mary");
        customer.setLastName("Seyi");
        customerRepository.save(customer);
        assertNotNull(customerRepository.findByCustomerId("675368996"));
        customerRepository.delete("675368996");
        assertNull(customerRepository.findByCustomerId("675368996"));

    }

    @Test
    void findAll() {
        Customer customer = new Customer();
        customer.setBvn("675368996");
        customer.setFirstName("Mary");
        customer.setLastName("Seyi");
        customerRepository.save(customer);
        customerRepository.save(customer);
        customerRepository.save(customer);
        assertEquals(3, customerRepository.findAll().size());
    }
}