package com.example.spe_mini.Services.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.spe_mini.Models.Activity1;
import com.example.spe_mini.Models.Activity2;
import com.example.spe_mini.Models.Activity3;
import com.example.spe_mini.Models.Activity4;
import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.Activity2Repo;
import com.example.spe_mini.Repo.EmployeeRepo;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class Activity2ServicesImplementationTest {
    @Test
    void testAddActivity1() {
        EmployeeRepo employeeRepo = mock(EmployeeRepo.class);
        when(employeeRepo.save(Mockito.<Employee>any())).thenReturn(new Employee());
        Date joinDate = Date.from(LocalDate.of(2024, 10, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        ArrayList<Activity1> activity1s = new ArrayList<>();
        ArrayList<Activity2> activity2s = new ArrayList<>();
        ArrayList<Activity3> activity3s = new ArrayList<>();
        ArrayList<Activity4> activity4s = new ArrayList<>();
        Employee employee = new Employee(1, "Saurabh", "Mobile No", "saurabh@gmail", "42 Main St", "143",
                "Roles", "Qualification", joinDate, "Department", activity1s, activity2s, activity3s, activity4s,
                new ArrayList<>());

        when(employeeRepo.findById(Mockito.<Integer>any())).thenReturn(Optional.of(employee));
        Activity2Repo activity2Repo = mock(Activity2Repo.class);
        when(activity2Repo.save(Mockito.<Activity2>any())).thenReturn(new Activity2());
        Activity2ServicesImplementation activity2ServicesImplementation = new Activity2ServicesImplementation();
        activity2ServicesImplementation.activity2Repo = activity2Repo;
        activity2ServicesImplementation.employeeRepo = employeeRepo;
        Employee actualAddActivityResult = activity2ServicesImplementation.addActivity(new Activity2(), 1);
        assertSame(employee, actualAddActivityResult);
        assertEquals(1, actualAddActivityResult.getActivity2s().size());
        verify(activity2Repo).save(Mockito.<Activity2>any());
        verify(employeeRepo).save(Mockito.<Employee>any());
        verify(employeeRepo).findById(Mockito.<Integer>any());
    }
}

