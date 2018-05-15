package com.afeng.dao.impl;

import com.afeng.dao.CustomerDao;
import com.afeng.domain.Customer;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    /**
     * 查询数据库中指定条数的商品
     * @return
     */
    public int findAll() {
        //获取模板进行查询
        String hql = "from Customer";
        List<Customer> list = (List<Customer>) this.getHibernateTemplate().find(hql);
        return list.size();
    }

    @Override
    public List<Customer> findByPage(DetachedCriteria criteria, int startIndex, int pageSize) {
        //获取模板进行查询
        List<Customer> list = (List<Customer>) this.getHibernateTemplate().findByCriteria(criteria, startIndex, pageSize);
        System.out.println(list);
        return list;
    }

}
