package com.am.projectwala.repositories;

import com.am.projectwala.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
    List<Notification> findByEmailId(String emailId);

}
