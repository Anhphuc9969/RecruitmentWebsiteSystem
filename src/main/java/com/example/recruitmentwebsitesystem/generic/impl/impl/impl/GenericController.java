package com.example.recruitmentwebsitesystem.generic.impl.impl.impl;

import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericController <T , E> {
    @Autowired
    private ObjectMapper objectMapper;

    private final BaseService<T, E> baseService;
    public GenericController(BaseService<T, E> baseService) {
        this.baseService = baseService;
    }
}
