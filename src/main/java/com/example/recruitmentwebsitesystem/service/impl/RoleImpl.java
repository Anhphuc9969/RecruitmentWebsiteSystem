package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.entity.Role;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import com.example.recruitmentwebsitesystem.service.RoleService;
import org.springframework.data.jpa.repository.JpaRepository;

public class RoleImpl extends GenericServiceImpl<Role, Integer> implements RoleService {

    public RoleImpl(JpaRepository<Role, Integer> jpaRepository) {
        super(jpaRepository);
    }
}
