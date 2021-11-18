package com.example.recruitmentwebsitesystem.repo;

import com.example.recruitmentwebsitesystem.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends BaseRepo<User, Integer> {
}
