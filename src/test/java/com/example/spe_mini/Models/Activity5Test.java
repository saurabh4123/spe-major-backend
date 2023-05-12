package com.example.spe_mini.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class Activity5Test {
    @Test
    void testConstructor() {
        Activity5 actualActivity5 = new Activity5();
        actualActivity5.setA5_id(1);
        actualActivity5.setAchievement("Achievement");
        Date date = Date.from(LocalDate.of(2022, 10, 5).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity5.setDate(date);
        actualActivity5.setRemark("Remark");
        actualActivity5.setStandard("Standard");
        actualActivity5.setStudentName("Timmy");
        assertEquals(1, actualActivity5.getA5_id());
        assertEquals("Achievement", actualActivity5.getAchievement());
        assertSame(date, actualActivity5.getDate());
        assertEquals("Remark", actualActivity5.getRemark());
        assertEquals("Standard", actualActivity5.getStandard());
        assertEquals("Timmy", actualActivity5.getStudentName());
    }
    @Test
    void testConstructor2() {
        Activity5 actualActivity5 = new Activity5(1, "Student Name", "Standard",
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), "Achievement",
                "Remark");
        actualActivity5.setA5_id(1);
        actualActivity5.setAchievement("Achievement");
        Date date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity5.setDate(date);
        actualActivity5.setRemark("Remark");
        actualActivity5.setStandard("Standard");
        actualActivity5.setStudentName("Student Name");
        assertEquals(1, actualActivity5.getA5_id());
        assertEquals("Achievement", actualActivity5.getAchievement());
        assertSame(date, actualActivity5.getDate());
        assertEquals("Remark", actualActivity5.getRemark());
        assertEquals("Standard", actualActivity5.getStandard());
        assertEquals("Student Name", actualActivity5.getStudentName());
    }
}

