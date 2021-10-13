package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BvnRepositoryImplTest {
    BvnRepository bvnRepository;
    void setUp(){
        bvnRepository = new BvnRepositoryImpl();
    }

    @Test
    void save() {
        Customer customer = new Customer();
        customer.setFirstName("Ozi");
        customer.setLastName("Zio");
        customer.setBvn("6548996");
        bvnRepository.save(customer);
        assertEquals(customer, bvnRepository.findById("6548996"));
    }

    @Test
    void deleteById() {
    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }
}