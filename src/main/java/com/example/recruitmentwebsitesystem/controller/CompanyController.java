package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class CompanyController extends GenericController<Company, Integer> {

    public CompanyController(BaseService<Company, Integer> baseService) {

        super(baseService);
    }
}
