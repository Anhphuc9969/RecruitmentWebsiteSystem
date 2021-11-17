package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.entity.JobsRegister;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import com.example.recruitmentwebsitesystem.service.JobRegisterService;
import org.springframework.data.jpa.repository.JpaRepository;

public class JobRegisterImpl extends GenericServiceImpl<JobsRegister, Integer> implements JobRegisterService {

    public JobRegisterImpl(JpaRepository<JobsRegister, Integer> jpaRepository) {
        super(jpaRepository);
    }
}
