package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.entity.Types;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import com.example.recruitmentwebsitesystem.service.TypesService;
import org.springframework.data.jpa.repository.JpaRepository;

public class TypesImpl extends GenericServiceImpl<Types, Integer> implements TypesService {

    public TypesImpl(JpaRepository<Types, Integer> jpaRepository) {
        super(jpaRepository);
    }
}
