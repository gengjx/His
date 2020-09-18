package com.gjxsoft.service;

import com.gjxsoft.domain.Department;
import com.gjxsoft.domain.Departmentconstantitem;

import java.util.List;


public interface DepartmentService {
    List<Department> findAllDepart();
    List<Departmentconstantitem> findDepartmentconstantitem();

    void updateDepartment(Department department);

    void deleteDepart(Integer id);
    void insertDepart(Department department);
    List<Departmentconstantitem> findByIdRrName(String idOrName);

}
