package com.example.spe_mini.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class Activity2Test {
    @Test
    void testConstructor() {
        Activity2 actualActivity2 = new Activity2();
        actualActivity2.setA2_id(1);
        actualActivity2.setAuthor("Saurabh");
        Date date = Date.from(LocalDate.of(2023, 5, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity2.setDate(date);
        actualActivity2.setPublication("Publication");
        actualActivity2.setRemark("Remark");
        actualActivity2.setTitle("Dr");
        assertEquals(1, actualActivity2.getA2_id());
        assertEquals("Saurabh", actualActivity2.getAuthor());
        assertSame(date, actualActivity2.getDate());
        assertEquals("Publication", actualActivity2.getPublication());
        assertEquals("Remark", actualActivity2.getRemark());
        assertEquals("Dr", actualActivity2.getTitle());
    }
    @Test
    void testConstructor2() {
        Activity2 actualActivity2 = new Activity2(1, "Meet", "Dr",
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), "Remark",
                "Publication");
        Date date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity2.setDate(date);
        assertEquals(1, actualActivity2.getA2_id());
        assertEquals("Meet", actualActivity2.getAuthor());
        assertSame(date, actualActivity2.getDate());
        assertEquals("Publication", actualActivity2.getPublication());
        assertEquals("Remark", actualActivity2.getRemark());
        assertEquals("Dr", actualActivity2.getTitle());
    }
}

