package com.am.projectwala.repositories;

import com.am.projectwala.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    @Transactional
    @Modifying
    @Query("update User u set u.type = ?1 where u.emailId = ?2")
    int updateTypeByEmailId(String type, String emailId);
    Optional<User> findByEmailIdAndPassword(String emailId, String password);


}
