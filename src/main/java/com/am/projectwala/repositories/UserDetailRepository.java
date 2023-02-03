package com.am.projectwala.repositories;

import com.am.projectwala.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<UserDetail, String> {
    Optional<UserDetail> findByEmailId(String emailId);

}
