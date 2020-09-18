package com.gjxsoft.service.impl;

import com.gjxsoft.dao.DiseaseDao;
import com.gjxsoft.domain.Disease;
import com.gjxsoft.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Autowired
    private DiseaseDao diseaseDao;

    @Override
    public List<Disease> findAll() {
        return diseaseDao.findAll();
    }

    @Override
    public void updateSettlecategory(Disease disease) {
        diseaseDao.updateSettlecategory(disease);

    }

    @Override
    public void insertSettlecategory(Disease disease) {
        diseaseDao.insertSettlecategory(disease);
    }

    @Override
    public void deleteSettlecategory(Integer id) {
        diseaseDao.deleteSettlecategory(id);
    }

    @Override
    public List<Disease> findByIdOrName(String idOrName) {
        return diseaseDao.findByIdOrName(idOrName);
    }
}
