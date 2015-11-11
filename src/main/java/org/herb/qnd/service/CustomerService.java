/**
 * 
 */
package org.herb.qnd.service;

import java.util.List;

import org.herb.qnd.domain.Customer;
import org.springframework.stereotype.Service;

/**
 * @author herb
 *
 */
@Service
public interface CustomerService {

	List<Customer> findByName(String customerName);	
	void save(Customer customer);
	List<Customer> findAll();
}
