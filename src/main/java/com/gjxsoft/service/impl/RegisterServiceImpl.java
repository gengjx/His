package com.gjxsoft.service.impl;

import com.gjxsoft.dao.RegisterDao;
import com.gjxsoft.domain.Register;
import com.gjxsoft.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterDao registerDao;
    @Override
    public void insertRegister(Register register) {
        registerDao.insertRegister(register);
    }

    @Override
    public Integer getCaseNumber() {
        return registerDao.getCaseNumber();
    }
}
