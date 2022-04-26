package com.ReeseStudying.ReeseRuffinSpringbootTraining.service;

import com.ReeseStudying.ReeseRuffinSpringbootTraining.entity.Department;

import java.util.List;

public interface DepartmentService {



    Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);
}
