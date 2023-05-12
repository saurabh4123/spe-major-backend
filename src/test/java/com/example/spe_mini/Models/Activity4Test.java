package com.example.spe_mini.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class Activity4Test {
    @Test
    void testConstructor() {
        Activity4 actualActivity4 = new Activity4();
        actualActivity4.setA4_id(1);
        actualActivity4.setAchievement("Achievement");
        Date date = Date.from(LocalDate.of(2021, 11, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity4.setDate(date);
        actualActivity4.setName("Sandy");
        actualActivity4.setRemark("Remark");
        assertEquals(1, actualActivity4.getA4_id());
        assertEquals("Achievement", actualActivity4.getAchievement());
        assertSame(date, actualActivity4.getDate());
        assertEquals("Sandy", actualActivity4.getName());
        assertEquals("Remark", actualActivity4.getRemark());
    }
    @Test
    void testConstructor2() {
        Activity4 actualActivity4 = new Activity4(1, "Maddy", "Achievement",
                Date.from(LocalDate.of(2023, 12, 15).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), "Remark");
        Date date = Date.from(LocalDate.of(2023, 12, 15).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity4.setDate(date);
        assertEquals(1, actualActivity4.getA4_id());
        assertEquals("Achievement", actualActivity4.getAchievement());
        assertSame(date, actualActivity4.getDate());
        assertEquals("Maddy", actualActivity4.getName());
        assertEquals("Remark", actualActivity4.getRemark());
    }
}

