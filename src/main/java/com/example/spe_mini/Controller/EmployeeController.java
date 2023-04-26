package com.example.spe_mini.Controller;

import com.example.spe_mini.Excel.EmployeeExcelExporter;
import com.example.spe_mini.Models.*;
import com.example.spe_mini.Services.EmployeeServices;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @GetMapping("/report-employee/{emp-id}")
    public void generateEmployeeReport(HttpServletResponse response, @PathVariable("emp-id") int emp_id, @RequestParam("year") int year, @RequestParam("month") int month) throws IOException
    {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=report_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);

        List<Activity1> activity1s = employeeServices.getActivity1s(employeeServices.getEmployeeByID(emp_id), month, year);
        List<Activity2> activity2s = employeeServices.getActivity2s(employeeServices.getEmployeeByID(emp_id), month, year);
        List<Activity3> activity3s = employeeServices.getActivity3s(employeeServices.getEmployeeByID(emp_id), month, year);
        List<Activity4> activity4s = employeeServices.getActivity4s(employeeServices.getEmployeeByID(emp_id), month, year);
        List<Activity5> activity5s = employeeServices.getActivity5s(employeeServices.getEmployeeByID(emp_id), month, year);

        EmployeeExcelExporter excelExporter = new EmployeeExcelExporter(activity1s, activity2s, activity3s, activity4s, activity5s);

        excelExporter.export(response);
    }
}
