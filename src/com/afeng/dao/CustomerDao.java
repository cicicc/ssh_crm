package com.afeng.dao;

import com.afeng.domain.Customer;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface CustomerDao {
    int findAll();

    List<Customer> findByPage(DetachedCriteria criteria, int startIndex, int pageSize);
}
