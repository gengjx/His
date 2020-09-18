package com.gjxsoft.dao;

import com.gjxsoft.domain.Department;
import com.gjxsoft.domain.Departmentconstantitem;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("DepartmentDao")
public interface DepartmentDao {
    List<Department> findAllDepart();

    List<Departmentconstantitem> findDepartmentconstantitem();

    void updateDepartment(Department department);

    void deleteDepart(Integer id);
    void insertDepart(Department department);

    List<Departmentconstantitem> findByIdRrName(String idOrName);
}
