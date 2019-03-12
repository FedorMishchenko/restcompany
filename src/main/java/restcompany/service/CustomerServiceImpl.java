package restcompany.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restcompany.model.Customer;
import restcompany.repository.CustomerRepository;

import java.util.List;

/**
 *
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer get(long id) {
        log.info("IN CustomerServiceImpl get{} " + id);
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save{} " + customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(long id) {
        log.info("IN CustomerServiceImpl delete{} " + id);
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAll{} ");
        return customerRepository.findAll();
    }
}
