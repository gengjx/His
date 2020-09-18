package com.gjxsoft.dao;

import com.gjxsoft.domain.Register;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterDao {
    void insertRegister(Register register);

    Integer getCaseNumber();
}
