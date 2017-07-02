package com.test.controller;

import com.test.entity.ChildCompany;
import com.test.entity.Company;
import com.test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;

/**
 * Created by Mykola on 22.06.2017.
 */


@Controller
public class IndexController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("Company", companyService.companyWithChildCompany());
        return "views-home-index";
    }
    @GetMapping("/updateCurentBalance/{id}")
    public String updateBalance(@PathVariable int id) {
        Company company = companyService.test(id);
        int current = 0;
        for (ChildCompany id2 : company.getCompanies()){
        int counter = id2.getChildValue() ;
        current += counter;
        company.setAllIncome(current+company.getValue());
        companyService.save(company);
        }

//

        return "redirect:/";
    }
}
