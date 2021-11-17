package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.entity.MethodWork;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class MethodWorkController extends GenericController<MethodWork, Integer> {

    public MethodWorkController(BaseService<MethodWork, Integer> baseService) {

        super(baseService);
    }
}
