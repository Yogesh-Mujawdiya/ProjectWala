package com.am.projectwala.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.Instant;

import static io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY;

@Entity
@Getter
@Setter
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "NAME")
    String name;

    @Column(name = "DESCRIPTION")
    String description;

    @Column(name = "PRICE")
    Double Price;

    @Lob
    @Column(name = "MEDIA")
    byte[] media;

    @Lob
    @Column(name = "DATA")
    byte[] data;

    @Column(name = "UPLOADER")
    String uploader;

    @Schema(accessMode = READ_ONLY)
    @Column(name = "UPLOADED_TIME")
    Timestamp uploadedTime = Timestamp.from(Instant.now());

    @Column(name = "CATEGORIES")
    String categories;

    @Column(name = "IS_VERIFIED")
    Boolean isVerified;
}
