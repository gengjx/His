package com.gjxsoft.service.impl;

import com.gjxsoft.dao.settlecategoryDao;
import com.gjxsoft.domain.Settlecategory;
import com.gjxsoft.service.settlecategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class settlecategoryServiceImpl implements settlecategoryService {
    @Autowired
    private settlecategoryDao settlecategoryDao;

    @Override
    public List<Settlecategory> findAll() {
        return settlecategoryDao.findAll();
    }

    @Override
    public void updateSettlecategory(Settlecategory settlecategory) {
        settlecategoryDao.updateSettlecategory(settlecategory);
    }

    @Override
    public void insertSettlecategory(Settlecategory settlecategory) {
        settlecategoryDao.insertSettlecategory(settlecategory);
    }

    @Override
    public void deleteSettlecategory(Integer id) {
        settlecategoryDao.deleteSettlecategory(id);
    }

    @Override
    public List<Settlecategory> findByIdOrName(String idOrName) {
        return settlecategoryDao.findByIdOrName(idOrName);
    }
}
