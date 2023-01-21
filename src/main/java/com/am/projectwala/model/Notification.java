package com.am.projectwala.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "notifications")
public class Notification {

    @Id
    @Column(name = "ID")
    Integer id;

    @Column(name = "EMAIL_ID")
    String emailId;

    @Column(name = "TITLE")
    String title;

    @Column(name = "DETAIL")
    String detail;

}
