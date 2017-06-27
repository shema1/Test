package com.test.dao;

import com.test.entity.Company;
import com.test.entity.ChildCompany;
import com.test.service.ChildCompanyService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Mykola on 22.06.2017.
 */
public interface CompanyDao extends JpaRepository <Company, Integer> {


    @Query("select distinct childCompany from Company childCompany left  join fetch childCompany.companies ")
   List<Company> companyWithChildCompany();


    @Query("SELECT  distinct  c from  Company  c left  join  fetch  c.companies where c.id=:id")
    Company test(@Param("id") int id);


}
