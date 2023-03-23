package com.csi.dao;

import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


public interface EmployeeDao {
    public void saveData(Employee employee);

    public List<Employee> getAllData();

    public void updateData(int empId,Employee employee);


    public void deleteDataById(int empId);


}
