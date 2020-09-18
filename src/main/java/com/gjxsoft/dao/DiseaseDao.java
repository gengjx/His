package com.gjxsoft.dao;

import com.gjxsoft.domain.Disease;

import java.util.List;

public interface DiseaseDao {
    List<Disease> findAll();

    void deleteSettlecategory(Integer id);

    List<Disease> findByIdOrName(String idOrName);

    void updateSettlecategory(Disease disease);

    void insertSettlecategory(Disease disease);
}
