package com.ReeseStudying.ReeseRuffinSpringbootTraining.controller;


import com.ReeseStudying.ReeseRuffinSpringbootTraining.entity.Department;
import com.ReeseStudying.ReeseRuffinSpringbootTraining.service.DepartmentService;
import com.ReeseStudying.ReeseRuffinSpringbootTraining.service.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.nio.file.Path;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    //AutoWired will call the dependency
    private DepartmentService departmentService;

    @PostMapping("/departments")
    //Posting the request to get data from the base
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    //brings back a list of data that is stored into the h2 database.
    //calling the LIST will bring everything that was posted into the database
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){

        return departmentService.fetchDepartmentById(departmentId);

    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId).
        return "Department has been deleted";
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){

        return departmentService.updateDepartment(departmentId, department);

    }



}
