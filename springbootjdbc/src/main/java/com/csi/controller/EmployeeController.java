package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;


    @PostMapping("/savedata")

    public ResponseEntity<String> saveData(@RequestBody Employee employee) {
        employeeServiceImpl.saveData(employee);
        return ResponseEntity.ok("data saved succesfully");
    }

    @GetMapping("/getalldata")

    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(employeeServiceImpl.getAll());
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<String> updateData(@PathVariable int empId, @RequestBody Employee employee) {
        employeeServiceImpl.updateData(empId, employee);
        return ResponseEntity.ok("dataupdated succesfully");

    }

    @DeleteMapping("/deletedatabyid/{empId}")
    public ResponseEntity<String> deleteById(@PathVariable int empId) {
        employeeServiceImpl.deleteById(empId);
        return ResponseEntity.ok("data deleteed succesfully");
    }
}
