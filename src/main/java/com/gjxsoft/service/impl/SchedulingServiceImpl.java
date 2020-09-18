package com.gjxsoft.service.impl;

import com.gjxsoft.dao.SchedulingDao;
import com.gjxsoft.domain.Scheduling;
import com.gjxsoft.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchedulingServiceImpl implements SchedulingService {
    @Autowired
    private SchedulingDao schedulingDao;
    @Override
    public List<Scheduling> findAll() {
        return schedulingDao.findAll();
    }

    @Override
    public List<Scheduling> findScheduling() {
        return schedulingDao.findScheduling();

    }

    @Override
    public void insertScheduling(Scheduling scheduling) {
        schedulingDao.insertScheduling(scheduling);
    }

    @Override
    public void deleteByID(Integer id) {
        schedulingDao.deleteByID(id);
    }
}
