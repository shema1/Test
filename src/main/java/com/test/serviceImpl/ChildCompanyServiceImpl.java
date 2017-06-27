package com.test.serviceImpl;

import com.test.dao.ChildCompanyDao;
import com.test.dao.CompanyDao;
import com.test.entity.ChildCompany;
import com.test.entity.Company;
import com.test.service.ChildCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mykola on 22.06.2017.
 */

@Service
public class ChildCompanyServiceImpl implements ChildCompanyService{

    @Autowired
    private  ChildCompanyDao childCompanyDao;

    @Autowired
    private CompanyDao companyDao;

    @Override
    public void save(ChildCompany childCompany) {


        childCompanyDao.save(childCompany);

    }



    @Override
    public List<ChildCompany> findAll() {
        return childCompanyDao.findAll();
    }

    @Override
    public ChildCompany findOne(int id) {
        return childCompanyDao.findOne(id);
    }

    @Override
    public void delete(int id) {
        childCompanyDao.delete(id);

    }

    @Override
    public void update(ChildCompany childCompany) {
 childCompanyDao.save(childCompany);

        }


    @Override
    public List<Company> listCom() {
        return childCompanyDao.listCom();
    }
}



