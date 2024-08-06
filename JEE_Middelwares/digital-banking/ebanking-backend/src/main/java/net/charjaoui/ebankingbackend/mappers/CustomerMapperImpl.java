package net.charjaoui.ebankingbackend.mappers;

import net.charjaoui.ebankingbackend.dto.CustomerDTO;
import net.charjaoui.ebankingbackend.models.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapperImpl {
    public CustomerDTO fromCustomer(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        //Mapping using BeanUtils.copyProperties
        BeanUtils.copyProperties(customer, customerDTO);

        return customerDTO;
    }

    public Customer fromCustomerDTO(CustomerDTO customerDTO){
        Customer customer = new Customer();
        //Mapping using BeanUtils.copyProperties
        BeanUtils.copyProperties(customerDTO, customer);

        return customer;
    }
}