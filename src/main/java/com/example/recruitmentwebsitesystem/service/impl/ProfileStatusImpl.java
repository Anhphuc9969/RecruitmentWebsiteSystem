package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.AcademicLevel;
import com.example.recruitmentwebsitesystem.entity.ProfileStatus;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.AcademicLevelService;
import com.example.recruitmentwebsitesystem.service.ProfileStatusService;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProfileStatusImpl extends GenericServiceImpl<ProfileStatus, Integer> implements ProfileStatusService {

    public ProfileStatusImpl(JpaRepository<ProfileStatus, Integer> jpaRepository) {
        super(jpaRepository);
    }
}
