package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.entity.Users;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class UsersController extends GenericController<Users, Integer> {

    public UsersController(BaseService<Users, Integer> baseService) {

        super(baseService);
    }
}
