package com.test.service;

import com.test.entity.ChildCompany;
import com.test.entity.Company;
import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mykola on 22.06.2017.
 */
public interface CompanyService {

    void save(Company company);
    List<Company> findAll();
    Company findOne(int id);
    void delete(int id);
    void update(Company company);
  // List<ChildCompany> companyWithChildCompany();
  Company companyWithChildCompany();
   // Company companyWithChildCompany( int id);


}
