package com.test.service;

import com.test.entity.ChildCompany;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mykola on 22.06.2017.
 */
public interface ChildCompanyService {

    void save(ChildCompany childCompany);
    List<ChildCompany> findAll();
    ChildCompany findOne(int id);
    void delete(int id);
    void update(ChildCompany childCompany);
//    List<ChildCompany> childCompanuWithCompany();
    void test();
  //  List<ChildCompany> companyWithChildCompany();
}
