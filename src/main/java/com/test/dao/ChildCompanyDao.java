package com.test.dao;

import com.test.entity.ChildCompany;
import com.test.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Mykola on 22.06.2017.
 */
public interface ChildCompanyDao extends JpaRepository <ChildCompany, Integer> {



        @Query ("select distinct  company from ChildCompany  company left join fetch  company.company ")
     List   <Company> listCom();

}

