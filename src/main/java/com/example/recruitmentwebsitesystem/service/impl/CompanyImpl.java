package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import com.example.recruitmentwebsitesystem.service.CompanyService;
import org.springframework.data.jpa.repository.JpaRepository;

public class CompanyImpl extends GenericServiceImpl<Company, Integer> implements CompanyService {

    public CompanyImpl(JpaRepository<Company, Integer> jpaRepository) {
        super(jpaRepository);
    }
}
