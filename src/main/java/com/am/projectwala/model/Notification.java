package com.am.projectwala.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "EMAIL_ID")
    String emailId;

    @Column(name = "TITLE")
    String title;

    @Column(name = "DETAIL")
    String detail;

}
