package com.afeng.service.impl;

import com.afeng.dao.CustomerDao;
import com.afeng.domain.Customer;
import com.afeng.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    private CustomerDao customerDao ;
    @Override
    public List<Customer> findAll() {
        List<Customer> list = customerDao.findAll();

        return null;
    }
}
