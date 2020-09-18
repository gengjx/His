package com.gjxsoft.service.impl;

import com.gjxsoft.dao.RegistlevelDao;
import com.gjxsoft.domain.Registlevel;
import com.gjxsoft.service.RegistlevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("registlevelService")
public class RegistlevelServiceImpl implements RegistlevelService {
    @Autowired
    private RegistlevelDao registlevelDao;

    @Override
    public Registlevel findRegistlevelByid(Integer id) {
        return registlevelDao.findRegistlevelByid(id);
    }

    @Override
    public List<Registlevel> findAll() {

        return registlevelDao.findAll();
    }

    @Override
    public void updateRegistLevel(Registlevel registlevel) {
        registlevelDao.updateRegistLevel(registlevel);
    }

    @Override
    public void insertDepart(Registlevel registlevel) {
        registlevelDao.insertRegistlevel(registlevel);
    }

    @Override
    public void deleteRegistLevel(Integer id) {
        registlevelDao.deleteRegistLevel(id);
    }

    @Override
    public List<Registlevel> findByIdOrName(String idOrName) {
        return registlevelDao.findByIdOrName(idOrName);
    }


}
