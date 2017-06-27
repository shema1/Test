package com.test.controller;

import com.test.entity.Company;
import com.test.service.ChildCompanyService;
import com.test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Created by Mykola on 22.06.2017.
 */
@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private ChildCompanyService childCompanyService;

    @GetMapping("/addCompany")
    @Transactional
    public String company(Model model){
        // model.addAttribute("Company", companyService.companyWithChildCompany());
         model.addAttribute("Company", companyService.companyWithChildCompany());
         model.addAttribute("qa",childCompanyService.findAll());
        model.addAttribute("addCompany", new Company());
        return "views-company-addCompany";
    }
    @PostMapping("/addCompany")
    public String addCompany(@ModelAttribute Company company){
        companyService.save(company);
        return "redirect:/addCompany";
    }

    @GetMapping("/deleteCompany/{id}")
    public  String delete (@PathVariable int id){
        companyService.delete(id);
        return "redirect:/addCompany";
}

    @GetMapping("/updateCompany/{id}")
    public String update(@PathVariable int id, Model model){

        Company company = companyService.findOne(id);
        model.addAttribute("curentCompany", company);


        return "views-company-updateCompany";
    }

    @PostMapping("/updateCompany/{id}")
    public String updateCompany(@RequestParam String name, @PathVariable int id) {
        Company company = companyService.findOne(id);
        company.setName(name);
        companyService.update(company);
        companyService.updateValue(company);
        return "redirect:/addCompany";
    }


}
