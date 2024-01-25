package ru.netology.stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTaskTest {
    @Test
    public void testSimpleTaskWhenMathes() {
        SimpleTask simpleTask = new SimpleTask(101, "Позвонить другу");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected,actual);
    }

}