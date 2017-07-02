package com.test.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mykola on 22.06.2017.
 */

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int value;
    private int allIncome;
    @OneToMany(mappedBy = "company", cascade = CascadeType.REMOVE)
    private List<ChildCompany> companies = new ArrayList<ChildCompany>();


          public Company(){

          }

    public int getAllIncome() {
        return allIncome;
    }

    public void setAllIncome(int allIncome) {
        this.allIncome = allIncome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<ChildCompany> getCompanies() {
        return companies;
    }

    public void setCompanies(List<ChildCompany> companies) {
        this.companies = companies;
    }
}

