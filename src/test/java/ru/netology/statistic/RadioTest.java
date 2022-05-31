package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void Next() {
        Radio cond = new Radio();
        cond.setNumbStation(8);
        cond.next();
        long expected = 9;
        long actual = cond.getNumbStation();
        assertEquals(expected, actual);
    }

    @Test
    public void Prev() {
        Radio cond = new Radio();
        cond.setNumbStation(8);
        cond.prev();
        long expected = 7;
        long actual = cond.getNumbStation();
        assertEquals(expected, actual);
    }

    @Test
    public void fin() {
        Radio cond = new Radio();
        cond.setVolume(8);
        cond.increaseVolume();
        long expected = 9;
        long actual = cond.getVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void fn() {
        Radio cond = new Radio();
        cond.setVolume(8);
        cond.decreaseVolume();
        long expected = 7;
        long actual = cond.getVolume();
        assertEquals(expected, actual);
    }
}