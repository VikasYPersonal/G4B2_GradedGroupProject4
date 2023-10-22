package com.greatLearning.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.employeeService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
