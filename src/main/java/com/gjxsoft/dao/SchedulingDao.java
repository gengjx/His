package com.gjxsoft.dao;

import com.gjxsoft.domain.Scheduling;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchedulingDao {
    List<Scheduling> findAll();
    List<Scheduling> findScheduling();

    void insertScheduling(Scheduling scheduling);

    void deleteByID(Integer id);
}
