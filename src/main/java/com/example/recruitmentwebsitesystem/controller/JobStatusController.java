package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.entity.JobStatus;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class JobStatusController extends GenericController<JobStatus, Integer> {

    public JobStatusController(BaseService<JobStatus, Integer> baseService) {

        super(baseService);
    }
}
