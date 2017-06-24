package com.test.editors;

import com.test.service.CompanyService;

import java.beans.PropertyEditorSupport;
import com.test.entity.Company;
/**
 * Created by Mykola on 23.06.2017.
 */
public class CompanyEditor extends PropertyEditorSupport {

    private final CompanyService companyService;
    public CompanyEditor(CompanyService companyService) {
        this.companyService = companyService;
    }

    @Override
    public void setAsText(String id) throws IllegalArgumentException {

        Company company = companyService.findOne(Integer.parseInt(id));

        setValue(company);

    }
}
