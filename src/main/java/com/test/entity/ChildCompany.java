package com.test.entity;

import javax.persistence.*;

/**
 * Created by Mykola on 22.06.2017.
 */
@Entity
public class ChildCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String childName;
    private int childValue;
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    public ChildCompany(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getChildValue() {
        return childValue;
    }

    public void setChildValue(int childValue) {
        this.childValue = childValue;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
