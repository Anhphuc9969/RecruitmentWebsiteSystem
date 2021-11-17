package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.entity.MethodWork;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import com.example.recruitmentwebsitesystem.service.MethodWorkService;
import org.springframework.data.jpa.repository.JpaRepository;

public class MethodWorkImpl extends GenericServiceImpl<MethodWork, Integer> implements MethodWorkService {

    public MethodWorkImpl(JpaRepository<MethodWork, Integer> jpaRepository) {
        super(jpaRepository);
    }
}
