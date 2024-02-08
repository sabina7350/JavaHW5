package ru.netology.javaqa.JavaHW5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScheduleTest {
    @Test
    public void ScheduleCount() {
        Schedule service = new Schedule();
        int expected = 4;
        int actual = service.calculate(37_000, 9_000, 50_000);

        Assertions.assertEquals(expected, actual);
    }
}
