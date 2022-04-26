package com.ReeseStudying.ReeseRuffinSpringbootTraining.repository;

import com.ReeseStudying.ReeseRuffinSpringbootTraining.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//this class is the repository where all the data will be coming and going
public interface DepartmentRepo extends JpaRepository<Department, Long> {
                                        //This class will find everything in the data



}
