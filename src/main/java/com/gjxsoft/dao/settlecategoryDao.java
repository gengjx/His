package com.gjxsoft.dao;

import com.gjxsoft.domain.Settlecategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface settlecategoryDao {


    List<Settlecategory> findAll();

    void updateSettlecategory(Settlecategory settlecategory);

    void insertSettlecategory(Settlecategory settlecategory);

    void deleteSettlecategory(Integer id);

    List<Settlecategory> findByIdOrName(String idOrName);
}
