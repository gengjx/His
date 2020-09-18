package com.gjxsoft.service;

import com.gjxsoft.domain.Disease;
import com.gjxsoft.domain.Settlecategory;

import java.util.List;

public interface DiseaseService {


    List<Disease> findAll();

    void updateSettlecategory(Disease disease);

    void insertSettlecategory(Disease disease);

    void deleteSettlecategory(Integer id);

    List<Disease> findByIdOrName(String idOrName);

}
