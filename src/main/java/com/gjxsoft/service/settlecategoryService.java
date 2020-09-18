package com.gjxsoft.service;

import com.gjxsoft.domain.Registlevel;
import com.gjxsoft.domain.Settlecategory;

import java.util.List;

public interface settlecategoryService {


    List<Settlecategory> findAll();

    void updateSettlecategory(Settlecategory settlecategory);

    void insertSettlecategory(Settlecategory settlecategory);

    void deleteSettlecategory(Integer id);

    List<Settlecategory> findByIdOrName(String idOrName);

}
