/**
 * 
 */
package org.herb.qnd.repository;

import java.util.List;

import org.herb.qnd.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * @author herb
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByName(String customerName);
	
}
