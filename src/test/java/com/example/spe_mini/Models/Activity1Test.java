package com.example.spe_mini.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class Activity1Test {
    @Test
    void testConstructor() {
        Activity1 actualActivity1 = new Activity1();
        actualActivity1.setA1_id(1);
        Date date = Date.from(LocalDate.of(2023, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity1.setDate(date);
        actualActivity1.setEvent("Event");
        actualActivity1.setNoOfParticipants(1);
        actualActivity1.setRemark("Remark");
        actualActivity1.setTitle("Dr");
        assertEquals(1, actualActivity1.getA1_id());
        assertSame(date, actualActivity1.getDate());
        assertEquals("Event", actualActivity1.getEvent());
        assertEquals(1, actualActivity1.getNoOfParticipants());
        assertEquals("Remark", actualActivity1.getRemark());
        assertEquals("Dr", actualActivity1.getTitle());
    }
    @Test
    void testConstructor2() {
        Activity1 actualActivity1 = new Activity1(1, "Event", "Dr",
                Date.from(LocalDate.of(2023, 5, 5).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), 1, "Remark");
        Date date = Date.from(LocalDate.of(2023, 5, 5).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualActivity1.setDate(date);
        assertEquals(1, actualActivity1.getA1_id());
        assertSame(date, actualActivity1.getDate());
        assertEquals("Event", actualActivity1.getEvent());
        assertEquals(1, actualActivity1.getNoOfParticipants());
        assertEquals("Remark", actualActivity1.getRemark());
        assertEquals("Dr", actualActivity1.getTitle());
    }
}

