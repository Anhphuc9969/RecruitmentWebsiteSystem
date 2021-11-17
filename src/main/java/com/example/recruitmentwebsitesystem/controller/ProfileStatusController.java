package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.entity.ProfileStatus;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class ProfileStatusController extends GenericController<ProfileStatus, Integer> {

    public ProfileStatusController(BaseService<ProfileStatus, Integer> baseService) {

        super(baseService);
    }
}
