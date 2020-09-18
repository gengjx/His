package com.gjxsoft.service;

import com.gjxsoft.domain.Register;

public interface RegisterService {
    void insertRegister(Register register);

    Integer getCaseNumber();
}
