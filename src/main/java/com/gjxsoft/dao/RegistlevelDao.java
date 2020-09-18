package com.gjxsoft.dao;

import com.gjxsoft.domain.Registlevel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistlevelDao {
    Registlevel findRegistlevelByid(Integer id);

    List<Registlevel> findAll();
    void updateRegistLevel(Registlevel registlevel);

    void insertRegistlevel(Registlevel registlevel);

    void deleteRegistLevel(Integer id);

    List<Registlevel> findByIdOrName(String idOrName);
}
