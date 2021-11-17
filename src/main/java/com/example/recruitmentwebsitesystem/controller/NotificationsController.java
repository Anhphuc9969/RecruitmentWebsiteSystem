package com.example.recruitmentwebsitesystem.controller;

import com.example.recruitmentwebsitesystem.entity.Company;
import com.example.recruitmentwebsitesystem.entity.Notifications;
import com.example.recruitmentwebsitesystem.generic.impl.impl.BaseService;
import com.example.recruitmentwebsitesystem.generic.impl.impl.impl.GenericController;

public class NotificationsController extends GenericController<Notifications, Integer> {

    public NotificationsController(BaseService<Notifications, Integer> baseService) {

        super(baseService);
    }
}
