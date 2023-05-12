package com.example.spe_mini.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    @Test
    void testConstructor() {
        Date joinDate = Date.from(LocalDate.of(2023, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        Employee actualEmployee = new Employee("Handy", "6395586740", "Handy@example.org", "IIIT B", "143",
                "Roles", "Qualification", joinDate, "CSE");

        assertNull(actualEmployee.getActivity1s());
        assertEquals("Roles", actualEmployee.getRoles());
        assertEquals("Qualification", actualEmployee.getQualification());
        assertEquals("143", actualEmployee.getPassword());
        assertEquals("Handy", actualEmployee.getName());
        assertEquals("6395586740", actualEmployee.getMobileNo());
        assertSame(joinDate, actualEmployee.getJoinDate());
        assertEquals("Handy@example.org", actualEmployee.getEmail());
        assertEquals(0, actualEmployee.getE_id());
        assertEquals("CSE", actualEmployee.getDepartment());
        assertEquals("IIIT B", actualEmployee.getAddress());
        assertNull(actualEmployee.getActivity5s());
        assertNull(actualEmployee.getActivity4s());
        assertNull(actualEmployee.getActivity3s());
        assertNull(actualEmployee.getActivity2s());
    }
}

