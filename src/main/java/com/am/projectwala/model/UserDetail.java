package com.am.projectwala.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user_details")
public class UserDetail {

    @Id
    @Column(name = "EMAIL_ID")
    String emailId;

    @Column(name = "FIRST_NAME")
    String firstName;

    @Column(name = "LAST_NAME")
    String lastName;

    @Column(name = "PHONE_NO")
    String phoneNo;

    @Column(name = "DOB")
    String dob;

    @Column(name = "WISHLIST")
    List<Integer> wishlist;

    @Column(name = "CART_ITEM")
    List<Integer> cartItem;

    @Column(name = "MY_PROJECTS")
    List<Integer> myProjects;

    @Column(name = "PURCHASING")
    List<Integer> purchasing;
}
