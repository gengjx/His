package com.gjxsoft.service;

import com.gjxsoft.domain.User;

import java.util.List;

public interface UserService {
    User LoginByUserNameandPass(User user);

    List<User> findUserByDepartID(Integer depart);

    List<User> findALL();

    void updateUserRID(Integer userID, String resgistId);
}