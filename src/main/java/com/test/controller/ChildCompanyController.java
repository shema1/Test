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

import java.util.ArrayList;



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
        model.addAttribute("companyChild", childCompanyService.listCom());
        model.addAttribute("addChildCompany", new ChildCompany() );
        return "views-childCompany-addChildCompany";
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

    @GetMapping("/updateChildCompany/{id}")
    public String update(@PathVariable int id, Model model){

        ChildCompany childCompany = childCompanyService.findOne(id);
        model.addAttribute("childCompany", childCompany);
        return "views-childCompany-updateChildCompany";
    }

    @PostMapping("/updateChildCompany/{id}")
    public String updateCompany(@RequestParam String childName,
                                @RequestParam int childValue,
                                @PathVariable int id) {
     ChildCompany childCompany = childCompanyService.findOne(id);
        childCompany.setChildName(childName);
        childCompany.setChildValue(childValue);
        childCompanyService.update(childCompany);
        return "redirect:/addChildCompany";
    }
}
