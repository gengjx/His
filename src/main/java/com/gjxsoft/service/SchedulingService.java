package com.gjxsoft.service;

import com.gjxsoft.domain.Scheduling;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SchedulingService {

     List<Scheduling> findAll();
     List<Scheduling> findScheduling();
     void insertScheduling(Scheduling  scheduling);
     void deleteByID(Integer id);

}
