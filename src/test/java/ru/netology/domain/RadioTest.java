package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void findStationMin() {
        Radio cond = new Radio();
        cond.setNumbStation(-1);
        long expected = 0;
        long actual = cond.getNumbStation();
        assertEquals(expected, actual);
    }

    @Test
    public void findStationMax() {
        Radio cond = new Radio();
        cond.setNumbStation(10);
        long expected = 0;
        long actual = cond.getNumbStation();
        assertEquals(expected, actual);
    }


    @Test
    public void pressNextStation() {
        Radio cond = new Radio();
        cond.setNumbStation(8);
        cond.next();
        long expected = 9;
        long actual = cond.getNumbStation();
        assertEquals(expected, actual);
    }

    @Test
    public void pressNextStationAfterMax() {
        Radio cond = new Radio();
        cond.setNumbStation(9);
        cond.next();
        long expected = 0;
        long actual = cond.getNumbStation();
        assertEquals(expected, actual);
    }

    @Test
    public void pressPrevStation() {
        Radio cond = new Radio();
        cond.setNumbStation(8);
        cond.prev();
        long expected = 7;
        long actual = cond.getNumbStation();
        assertEquals(expected, actual);
    }

    @Test
    public void pressPrevStationAfterMin() {
        Radio cond = new Radio();
        cond.setNumbStation(0);
        cond.prev();
        long expected = 9;
        long actual = cond.getNumbStation();
        assertEquals(expected, actual);
    }

    @Test
    public void findVolumeMin() {
        Radio cond = new Radio();
        cond.setVolume(-1);
        long expected = 0;
        long actual = cond.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void findVolumeMax() {
        Radio cond = new Radio();
        cond.setVolume(11);
        long expected = 0;
        long actual = cond.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void pressIncreaseVolume() {
        Radio cond = new Radio();
        cond.setVolume(8);
        cond.increaseVolume();
        long expected = 9;
        long actual = cond.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void pressIncreaseVolumeAfterMax() {
        Radio cond = new Radio();
        cond.setVolume(10);
        cond.increaseVolume();
        long expected = 10;
        long actual = cond.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void pressDecreaseVolume() {
        Radio cond = new Radio();
        cond.setVolume(8);
        cond.decreaseVolume();
        long expected = 7;
        long actual = cond.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void pressIncreaseVolumeAfterMin() {
        Radio cond = new Radio();
        cond.setVolume(0);
        cond.decreaseVolume();
        long expected = 0;
        long actual = cond.getVolume();
        assertEquals(expected, actual);
    }

}