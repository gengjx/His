package com.gjxsoft.service;

import com.gjxsoft.domain.Registlevel;

import java.util.List;

public interface RegistlevelService {
    Registlevel findRegistlevelByid(Integer id);

    List<Registlevel> findAll();

    void updateRegistLevel(Registlevel registlevel);

    void insertDepart(Registlevel registlevel);

    void deleteRegistLevel(Integer id);

    List<Registlevel> findByIdOrName(String idOrName);
}
