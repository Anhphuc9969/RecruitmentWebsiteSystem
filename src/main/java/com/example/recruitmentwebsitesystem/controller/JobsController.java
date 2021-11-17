package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.entity.Jobs;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class JobsController extends GenericController<Jobs, Integer> {

    public JobsController(BaseService<Jobs, Integer> baseService) {

        super(baseService);
    }
}
