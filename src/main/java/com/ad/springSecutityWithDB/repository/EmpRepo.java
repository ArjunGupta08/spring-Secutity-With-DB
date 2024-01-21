package com.ad.springSecutityWithDB.repository;

import com.ad.springSecutityWithDB.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
