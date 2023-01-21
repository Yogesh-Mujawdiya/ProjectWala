package com.am.projectwala.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "EMAIL_ID")
    String emailId;

    @Column(name = "PASSWORD")
    String password;

    @Column(name = "TYPE")
    String type;

}
