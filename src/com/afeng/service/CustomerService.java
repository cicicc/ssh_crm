package com.afeng.service;

import com.afeng.domain.Customer;
import com.afeng.domain.PageBean;
import org.hibernate.criterion.DetachedCriteria;


public interface CustomerService {

    PageBean<Customer> findByPage(int pageNumber);

}
