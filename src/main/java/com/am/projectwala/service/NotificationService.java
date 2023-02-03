package com.am.projectwala.service;

import com.am.projectwala.model.Notification;

import java.util.List;

public interface NotificationService {

    List<Notification> getNotificationByUser(String emailId);

    Notification addNotification(Notification notification);

    Notification deleteNotification(Integer id);

}
