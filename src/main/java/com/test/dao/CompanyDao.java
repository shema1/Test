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


//
//@Query("select  distinct d from  ChildCompany  d left  join  fetch d.company")
//List<ChildCompany> companyWithChildCompany();
//

//
    @Query("select  d from Company d left  join fetch d.companies ")
   Company companyWithChildCompany();
}
