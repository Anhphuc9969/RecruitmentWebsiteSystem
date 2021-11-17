package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.LevelRank;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import com.example.recruitmentwebsitesystem.service.LevelRankService;
import org.springframework.data.jpa.repository.JpaRepository;

public class LevelRankImpl  extends GenericServiceImpl<LevelRank, Integer> implements LevelRankService {

        public LevelRankImpl(JpaRepository<LevelRank, Integer> jpaRepository) {
                super(jpaRepository);
        }
}

