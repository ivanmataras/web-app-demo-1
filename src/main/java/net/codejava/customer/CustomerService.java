package net.codejava.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> listAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer get(Long id) {
        return customerRepository.findById(id).get();
    }

    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    public List<Customer> search(String keyword) {
        return customerRepository.search(keyword);
    }

}