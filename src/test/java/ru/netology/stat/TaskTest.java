package ru.netology.stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testSimpleTaskWhenMathes() {
        SimpleTask simpleTask = new SimpleTask(101, "Позвонить другу");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSimpleTaskWhenNotMathes() {
        SimpleTask simpleTask = new SimpleTask(101, "Позвонить другу");

        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testEpicWhenMathes() {
        String[] subtasks = {"Хлеб", "Яйца", "Молоко"};
        Epic epic = new Epic(103, subtasks );

        boolean actual = epic.matches("Хлеб");
        boolean expected = true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testEpicWhenNotMathes() {
        String[] subtasks = {"Хлеб", "Яйца", "Молоко"};
        Epic epic = new Epic(103, subtasks );

        boolean actual = epic.matches("Батон");
        boolean expected = false;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testMeetingWhenMathesTopic() {
        Meeting meeting = new Meeting(104,"Важное совещание", "Новое приложение", "Завтра");

        boolean actual = meeting.matches("Важное");
        boolean expected = true;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testMeetingWhenMathesProject() {
        Meeting meeting = new Meeting(104,"Важное совещание", "Новое приложение", "Завтра");

        boolean actual = meeting.matches("приложение");
        boolean expected = true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testMeetingWhenNotMathes() {
        Meeting meeting = new Meeting(104,"Важное совещание", "Новое приложение", "Завтра");

        boolean actual = meeting.matches("Уборка");
        boolean expected = false;

        Assertions.assertEquals(expected,actual);
    }



}