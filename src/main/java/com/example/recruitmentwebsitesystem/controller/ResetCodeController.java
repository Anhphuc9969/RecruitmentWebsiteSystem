package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.entity.ResetCode;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class ResetCodeController extends GenericController<ResetCode, Integer> {

    public ResetCodeController(BaseService<ResetCode, Integer> baseService) {

        super(baseService);
    }
}
