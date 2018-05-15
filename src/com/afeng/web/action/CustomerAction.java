package com.afeng.web.action;

import com.afeng.domain.Customer;
import com.afeng.domain.PageBean;
import com.afeng.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    private CustomerService customerService ;
    private Customer customer = new Customer();
    private int pageNumber;
    @Override
    public Customer getModel() {
        return customer;
    }



    public String findByPage(){
        if (pageNumber == 0) {
            pageNumber = 1;
        }
        PageBean<Customer> customerPageBean = customerService.findByPage(pageNumber);
        
        return "list";
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}
