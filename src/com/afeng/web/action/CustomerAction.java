package com.afeng.web.action;

import com.afeng.domain.Customer;
import com.afeng.service.CustomerService;
import com.afeng.service.impl.CustomerServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    private CustomerService customerService ;
    private Customer customer = new Customer();
    @Override
    public Customer getModel() {
        return customer;
    }
    public String findAll(){
        List<Customer> list =  customerService.findAll();
        return "list";
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}
