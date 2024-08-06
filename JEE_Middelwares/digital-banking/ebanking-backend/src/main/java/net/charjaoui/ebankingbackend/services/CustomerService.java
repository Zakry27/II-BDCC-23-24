package net.charjaoui.ebankingbackend.services;

import net.charjaoui.ebankingbackend.dto.CustomerDTO;
import net.charjaoui.ebankingbackend.exceptions.CustomerNotFoundException;


import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getCustomers();
    CustomerDTO getCustomerById(Long id) throws CustomerNotFoundException;
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(Long customerId);
    List<CustomerDTO> searchCustomers(String keyword);
}