package com.gjxsoft.service.impl;

import com.gjxsoft.dao.UserDao;
import com.gjxsoft.domain.User;
import com.gjxsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User LoginByUserNameandPass(User user) {
        return userDao.LoginByUserNameandPass(user);
    }

    @Override
    public List<User> findUserByDepartID(Integer depart) {
        return userDao.findUserByDepartID(depart);
    }

    @Override
    public List<User> findALL() {
        return userDao.findAll();
    }

    @Override
    public void updateUserRID(Integer userID, String resgistId) {
        userDao.updateUserRID(userID,Integer.parseInt(resgistId));
    }
}
