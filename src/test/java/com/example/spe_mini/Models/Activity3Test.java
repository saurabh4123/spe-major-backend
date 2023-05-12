package com.example.spe_mini.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class Activity3Test {
    @Test
    void testConstructor() {
        Activity3 actualActivity3 = new Activity3();
        actualActivity3.setA3_id(1);
        Date date = Date.from(LocalDate.of(2023, 8, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity3.setDate(date);
        actualActivity3.setNameOfResearchers("Name Of Researchers");
        actualActivity3.setTitleOfResearch("Engineering");
        assertEquals(1, actualActivity3.getA3_id());
        assertSame(date, actualActivity3.getDate());
        assertEquals("Name Of Researchers", actualActivity3.getNameOfResearchers());
        assertEquals("Engineering", actualActivity3.getTitleOfResearch());
    }
    @Test
    void testConstructor2() {
        Activity3 actualActivity3 = new Activity3(1, "Engineering",
                Date.from(LocalDate.of(2024, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), "Name Of Researchers");
        actualActivity3.setA3_id(1);
        Date date = Date.from(LocalDate.of(2024, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity3.setDate(date);
        assertEquals(1, actualActivity3.getA3_id());
        assertSame(date, actualActivity3.getDate());
        assertEquals("Name Of Researchers", actualActivity3.getNameOfResearchers());
        assertEquals("Engineering", actualActivity3.getTitleOfResearch());
    }
}

