package com.am.projectwala.service.impl;

import com.am.projectwala.model.Notification;
import com.am.projectwala.repositories.NotificationRepository;
import com.am.projectwala.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    @Override
    public List<Notification> getNotificationByUser(String emailId) {
        return notificationRepository.findByEmailId(emailId);
    }

    @Override
    public Notification addNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public Notification deleteNotification(Integer id) {
        Optional<Notification> notificationData = notificationRepository.findById(id);
        if(notificationData.isEmpty())
            return null;
        notificationRepository.deleteById(id);
        return notificationData.get();
    }
}
