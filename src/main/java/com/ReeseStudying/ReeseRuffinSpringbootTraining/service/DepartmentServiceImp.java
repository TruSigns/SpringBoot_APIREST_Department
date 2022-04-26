package com.ReeseStudying.ReeseRuffinSpringbootTraining.service;


import com.ReeseStudying.ReeseRuffinSpringbootTraining.entity.Department;
import com.ReeseStudying.ReeseRuffinSpringbootTraining.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

//create the service in this class
@Service
public class DepartmentServiceImp implements DepartmentService{

    @Autowired
    private DepartmentRepo departmentRepo;


    @Override
    public Department saveDepartment(Department department) {
        //Department repo will save whatever is thrown from the depart class
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepo.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepo.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepo.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department departmentDB = departmentRepo.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            departmentDB.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            departmentDB.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            departmentDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepo.save(departmentDB);


    }
}
