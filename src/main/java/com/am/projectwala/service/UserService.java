package com.am.projectwala.service;

import com.am.projectwala.model.User;
import com.am.projectwala.model.UserDetail;

public interface UserService {

    UserDetail login(String emailId, String password);

    UserDetail signup(UserDetail userDetail, String password);

    UserDetail deleteUser(String emailId);

    User setUserType(String emailId, String type);
}
