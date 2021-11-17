package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import com.example.recruitmentwebsitesystem.service.JobStatusService;
import org.springframework.data.jpa.repository.JpaRepository;

public class JobStatusImpl extends GenericServiceImpl<JobStatusImpl, Integer> implements JobStatusService {

    public JobStatusImpl(JpaRepository<JobStatusImpl, Integer> jpaRepository) {
        super(jpaRepository);
    }
}
