package com.am.projectwala.service.impl;

import com.am.projectwala.model.User;
import com.am.projectwala.model.UserDetail;
import com.am.projectwala.repositories.UserDetailRepository;
import com.am.projectwala.repositories.UserRepository;
import com.am.projectwala.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserDetailRepository userDetailRepository;

    @Override
    public UserDetail login(String emailId, String password) {
        Optional<User> userData = userRepository.findByEmailIdAndPassword(emailId, password);
        if(userData.isEmpty())
            return null;
        Optional<UserDetail> userDetailData = userDetailRepository.findByEmailId(emailId);
        if(userDetailData.isEmpty()) {
            UserDetail userDetail = new UserDetail();
            userDetail.setEmailId(emailId);
            return userDetailRepository.save(userDetail);
        }
        return userDetailData.get();
    }

    @Override
    public UserDetail signup(UserDetail userDetail, String password) {
        User user = new User();
        user.setEmailId(userDetail.getEmailId());
        user.setPassword(password);
        user.setType("user");
        userRepository.save(user);
        return userDetailRepository.save(userDetail);
    }

    @Override
    public UserDetail deleteUser(String emailId) {
        Optional<User> userData = userRepository.findById(emailId);
        if(userData.isEmpty())
            return null;
        Optional<UserDetail> userDetailData = userDetailRepository.findByEmailId(emailId);
        if(userDetailData.isEmpty()) {
            userRepository.deleteById(emailId);
            return null;
        }
        userDetailRepository.deleteById(emailId);
        return userDetailData.get();
    }

    @Override
    public User setUserType(String emailId, String type) {
        if(userRepository.updateTypeByEmailId(type, emailId)==1) {
            Optional<User> userData = userRepository.findById(emailId);
            if(userData.isEmpty())
                return null;
            User user = userData.get();
            user.setPassword(null);
            return user;
        }
        return null;
    }
}
