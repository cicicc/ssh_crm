package com.afeng.service.impl;

import com.afeng.dao.CustomerDao;
import com.afeng.domain.Customer;
import com.afeng.domain.PageBean;
import com.afeng.service.CustomerService;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    //注入customerDao
    private CustomerDao customerDao ;
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    /**
     * 调用dao层查询所有的商品
     * @return 商品列表
     */
//    @Override
//    @Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED)
//    public List<Customer> findAll() {
//        return  customerDao.findAll();
//    }

    /**
     * 查询指定页码的商品信息
     * @param pageNumber 指定的页码数
     * @return 查询到的商品列表
     */
    @Override
    @Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED)
    public  PageBean<Customer> findByPage(int pageNumber) {
        //设置默认的页码数
        int pageSize = 10;
        int totalRecord = customerDao.findAll();
        PageBean<Customer> pageBean = new PageBean<>(pageNumber, pageSize, totalRecord);
        DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
        List<Customer> list = customerDao.findByPage(criteria,pageBean.getStartIndex(),pageSize);
        pageBean.setData(list);
        return pageBean;
    }

}
