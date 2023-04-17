package com.example.spe_mini.Controller;

import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeServices;
    @PostMapping("/create-employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee employee1 = this.employeeServices.createEmployee(employee);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
    @GetMapping("/get-all")
    public ResponseEntity<?> getAllEmployees()
    {
        List<Employee> list=this.employeeServices.getAllEmployees();
        return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-empById/{emp_id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("emp_id") Integer id)
    {
        Employee employee=this.employeeServices.getEmployeeByID(id);
        return new ResponseEntity<>(employee,HttpStatus.ACCEPTED);
    }

    @GetMapping("/assignActivity1/{eid}/{a_id}")
    public ResponseEntity<Employee> assignActivity1(@PathVariable("eid") Integer eid,@PathVariable("a_id") Integer a_id){
        Employee employee1 = this.employeeServices.assignActivity1(eid,a_id);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }

    @GetMapping("/assignActivity2/{eid}/{a_id}")
    public ResponseEntity<Employee> assignActivity2(@PathVariable("eid") Integer eid,@PathVariable("a_id") Integer a_id){
        Employee employee1 = this.employeeServices.assignActivity2(eid,a_id);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
    @GetMapping("/assignActivity3/{eid}/{a_id}")
    public ResponseEntity<Employee> assignActivity3(@PathVariable("eid") Integer eid,@PathVariable("a_id") Integer a_id){
        Employee employee1 = this.employeeServices.assignActivity3(eid,a_id);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
    @GetMapping("/assignActivity4/{eid}/{a_id}")
    public ResponseEntity<Employee> assignActivity4(@PathVariable("eid") Integer eid,@PathVariable("a_id") Integer a_id){
        Employee employee1 = this.employeeServices.assignActivity4(eid,a_id);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
    @GetMapping("/assignActivity5/{eid}/{a_id}")
    public ResponseEntity<Employee> assignActivity5(@PathVariable("eid") Integer eid,@PathVariable("a_id") Integer a_id){
        Employee employee1 = this.employeeServices.assignActivity5(eid,a_id);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
}
