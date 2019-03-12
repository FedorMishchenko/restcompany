package restcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restcompany.model.Customer;

/**
 * Repository interface for {@link Customer} class
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
