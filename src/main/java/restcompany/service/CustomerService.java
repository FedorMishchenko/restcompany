package restcompany.service;

import restcompany.model.Customer;

import java.util.List;

/**
 *
 */
public interface CustomerService {
    Customer get(long id);
    void save(Customer customer);
    void delete(long id);
    List<Customer> getAll();
}
