package com.test.controller;

import com.test.editors.CompanyEditor;
import com.test.entity.ChildCompany;
import com.test.entity.Company;
import com.test.service.ChildCompanyService;
import com.test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.WebDataBinder;




/**
 * Created by Mykola on 22.06.2017.
 */
@Controller
public class ChildCompanyController {

    @Autowired
    private ChildCompanyService childCompanyService;
    @Autowired
    private CompanyService companyService;

    @InitBinder
    public void initBinder (WebDataBinder binder){
        binder.registerCustomEditor(Company.class, new CompanyEditor(companyService));

    }


    @GetMapping("/addChildCompany")
    public String childCompany(Model model){
        model.addAttribute("company",companyService.findAll());
        model.addAttribute("companyChild", childCompanyService.findAll());
        model.addAttribute("addChildCompany", new ChildCompany() );
        return "addChildCompany";
    }

    @PostMapping("/addChildCompany")
    public String addChildCompany(@ModelAttribute ChildCompany childCompany){
       childCompanyService.save(childCompany);
        return "redirect:/addChildCompany";
    }

    @GetMapping("/deleteChildCompany/{id}")
    public  String delete (@PathVariable int id){
        childCompanyService.delete(id);
        return "redirect:/addChildCompany";
    }
}
