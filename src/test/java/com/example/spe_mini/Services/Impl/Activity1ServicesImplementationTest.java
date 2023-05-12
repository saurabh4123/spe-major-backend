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
import com.example.spe_mini.Repo.Activity1Repo;
import com.example.spe_mini.Repo.EmployeeRepo;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class Activity1ServicesImplementationTest {
    @Test
    void testAddActivity1() {
                EmployeeRepo employeeRepo = mock(EmployeeRepo.class);
        when(employeeRepo.save(Mockito.<Employee>any())).thenReturn(new Employee());
        Date joinDate = Date.from(LocalDate.of(2024, 2, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        ArrayList<Activity1> activity1s = new ArrayList<>();
        ArrayList<Activity2> activity2s = new ArrayList<>();
        ArrayList<Activity3> activity3s = new ArrayList<>();
        ArrayList<Activity4> activity4s = new ArrayList<>();
        Employee employee = new Employee(1, "Saurabh", "Mobile No", "saurabh@gmail", "42 Main St", "143",
                "Roles", "Qualification", joinDate, "Department", activity1s, activity2s, activity3s, activity4s,
                new ArrayList<>());

        when(employeeRepo.findById(Mockito.<Integer>any())).thenReturn(Optional.of(employee));
        Activity1Repo activity1Repo = mock(Activity1Repo.class);
        when(activity1Repo.save(Mockito.<Activity1>any())).thenReturn(new Activity1());
        Activity1ServicesImplementation activity1ServicesImplementation = new Activity1ServicesImplementation();
        activity1ServicesImplementation.activity1Repo = activity1Repo;
        activity1ServicesImplementation.employeeRepo = employeeRepo;
        Employee actualAddActivityResult = activity1ServicesImplementation.addActivity(new Activity1(), 1);
        assertSame(employee, actualAddActivityResult);
        assertEquals(1, actualAddActivityResult.getActivity1s().size());
        verify(activity1Repo).save(Mockito.<Activity1>any());
        verify(employeeRepo).save(Mockito.<Employee>any());
        verify(employeeRepo).findById(Mockito.<Integer>any());
    }
}

