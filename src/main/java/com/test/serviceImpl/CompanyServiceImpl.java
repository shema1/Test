package com.test.serviceImpl;

import com.test.dao.CompanyDao;
import com.test.entity.ChildCompany;
import com.test.entity.Company;
import com.test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mykola on 22.06.2017.
 */

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public void save(Company company) {
        companyDao.save(company);

    }

    @Override
    public List<Company> findAll() {
        return companyDao.findAll();
    }

    @Override
    public Company findOne(int id) {
        return companyDao.findOne(id);
    }

    @Override
    public void delete(int id) {
            companyDao.delete(id);
    }

    @Override
    public void update(Company company) {
    companyDao.save(company);
    }

//    @Override
//    public List<ChildCompany> companyWithChildCompany() {
//        return (List<ChildCompany>) companyDao.companyWithChildCompany();
//    }

    @Override
    public Company companyWithChildCompany() {
        return companyDao.companyWithChildCompany();
    }

//
//    @Override
//    public Company companyWithChildCompany(int id) {
//        return companyDao.companyWithChildCompany(id);
//    }
}
