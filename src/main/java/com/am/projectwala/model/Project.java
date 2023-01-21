package com.am.projectwala.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.VarbinaryJdbcType;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "ID")
    int id;

    @Column(name = "NAME")
    String name;

    @Column(name = "DESCRIPTION")
    String description;

//    @Column(name = "MEDIA")
//    VarbinaryJdbcType media;

    @Column(name = "PRICE")
    Double Price;

//    @Column(name = "DATA")
//    VarbinaryJdbcType data;

    @Column(name = "UPLOADER")
    String uploader;

    @Column(name = "UPLOADED_TIME")
    Timestamp uploadedTime;

    @Column(name = "CATEGORIES")
    String categories;

    @Column(name = "IS_VERIFIED")
    Boolean isVerified;
}
