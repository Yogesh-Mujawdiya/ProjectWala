package com.am.projectwala.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
