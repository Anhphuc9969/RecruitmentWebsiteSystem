package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.entity.LevelRank;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class LevelRankController extends GenericController<LevelRank, Integer> {

    public LevelRankController(BaseService<LevelRank, Integer> baseService) {

        super(baseService);
    }
}
