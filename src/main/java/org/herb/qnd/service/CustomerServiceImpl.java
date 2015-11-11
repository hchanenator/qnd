/**
 * 
 */
package org.herb.qnd.service;

import java.util.List;

import org.herb.qnd.domain.Customer;
import org.herb.qnd.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author herb
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	/* (non-Javadoc)
	 * @see org.herb.qnd.service.CustomerService#findByName(java.lang.String)
	 */
	public List<Customer> findByName(String customerName) {
		
		return customerRepository.findByName(customerName);
	}
	
	public void save(Customer customer) {
		customerRepository.save(customer);
	}

	/* (non-Javadoc)
	 * @see org.herb.qnd.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}
	

}
