package com.afeng.web.action;

import com.afeng.domain.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();
    @Override
    public Customer getModel() {
        return customer;
    }
}
