package com.example.recruitmentwebsitesystem.service.impl;

import com.example.recruitmentwebsitesystem.entity.User;
import com.example.recruitmentwebsitesystem.generic.impl.GenericServiceImpl;
import com.example.recruitmentwebsitesystem.service.UsersService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersImpl extends GenericServiceImpl<User, Integer> implements UsersService {

    public UsersImpl(JpaRepository<User, Integer> jpaRepository) {
        super(jpaRepository);
    }
}
