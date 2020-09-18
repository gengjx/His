package com.gjxsoft.dao;

import com.gjxsoft.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public interface UserDao {

    User LoginByUserNameandPass(User user);

    List<User> findUserByDepartID(Integer depart);

    List<User> findAll();

    void updateUserRID(@Param("userID") Integer userID, @Param("resgistId") Integer resgistId);
}
