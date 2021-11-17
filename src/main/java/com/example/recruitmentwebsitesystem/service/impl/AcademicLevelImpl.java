package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import org.springframework.data.jpa.repository.JpaRepository;

public class AcademicLevelImpl extends GenericServiceImpl<AcademicLevel, Integer> implements AcademicLevelService {

    public AcademicLevelImpl(JpaRepository<AcademicLevel, Integer> jpaRepository) {
        super(jpaRepository);
    }
}