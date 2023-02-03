package com.am.projectwala.repositories;

import com.am.projectwala.model.OrderData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDataRepository extends JpaRepository<OrderData, Integer> {
    List<OrderData> findByEmailIdOrderByDateTimeDesc(String emailId);


}
