package com.test.controller;

import com.test.entity.Company;
import com.test.service.ChildCompanyService;
import com.test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String company(Model model){
        // model.addAttribute("Company", companyService.companyWithChildCompany());
         model.addAttribute("Company", companyService.findAll());
         model.addAttribute("qa",childCompanyService.findAll());
        model.addAttribute("addCompany", new Company());
        return "addCompany";
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

//    @GetMapping("/updateCompany/{id}")
//    public String update(@PathVariable int id, Model model){
////           companyService.findOne(id);
//        model.addAttribute("update", companyService.findOne(id));
//        return "updateCompany";
//    }

}
