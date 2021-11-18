package com.example.recruitmentwebsitesystem.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "profiles")
public class Profiles {
    @Id
    @Column(nullable = false)
    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @Column(name = "skill", nullable = false)
    String skill;

    @Column(name = "number_years_experience", nullable = false)
    int numberYearsExperience;

    @Column(name = "academic_name", nullable = false)
    String academicName;

    @Column(name = "desired_salary", nullable = false)
    int desiredSalary;

    @Column(name = "desired_working_address", nullable = false)
    String desiredWorkingAddress;

    @Column(name = "is_delete", nullable = false)
    boolean isDelete;
}
