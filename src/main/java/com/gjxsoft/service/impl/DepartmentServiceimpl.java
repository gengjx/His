package com.gjxsoft.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gjxsoft.dao.DepartmentDao;
import com.gjxsoft.domain.Department;
import com.gjxsoft.domain.Departmentconstantitem;
import com.gjxsoft.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service("departmentService")
@Transactional
public class DepartmentServiceimpl  implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
    public List<Department> findAllDepart() {
        return departmentDao.findAllDepart();
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
    public List<Departmentconstantitem> findDepartmentconstantitem() {
        return departmentDao.findDepartmentconstantitem();

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void updateDepartment(Department department) {
       departmentDao.updateDepartment(department);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void deleteDepart(Integer id) {
        departmentDao.deleteDepart(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void insertDepart(Department department) {
        departmentDao.insertDepart(department);
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
    public List<Departmentconstantitem> findByIdRrName(String idOrName) {
        return departmentDao.findByIdRrName(idOrName);
    }
}
