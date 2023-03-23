package com.csi.service;

import com.csi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public void saveData(Employee employee);

    public List<Employee> getAll();

    public void updateData(int empId,Employee employee);

    public void deleteById(int empId);

}
