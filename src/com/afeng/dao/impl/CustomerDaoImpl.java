package com.afeng.dao.impl;

import com.afeng.dao.CustomerDao;
import com.afeng.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    @Override
    public List<Customer> findAll() {
        return null;
    }


}
