package com.am.projectwala.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "order_data")
public class OrderData {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "EMAIL_ID")
    String emailId;

    @Column(name = "PAYMENT_STATUS")
    String  paymentStatus;

    @Column(name = "DATE_TIME")
    Timestamp dateTime;

    @Column(name = "ITEM_LIST")
    List<Integer> itemList;

    @Column(name = "TOTAL_AMOUNT")
    Double totalAmount;

}
