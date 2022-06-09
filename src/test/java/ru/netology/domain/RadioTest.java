package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void setQuantityOfStations() {
        Radio radio = new Radio(10);
        assertEquals(10, radio.getQuantityOfStations());
    }

    @Test
    public void shouldCreatRadioStation() {
        Radio radio = new Radio();
        radio.setAnyStation(-1);
        assertEquals(0, radio.getNumbStation());
    }

    @Test
    public void findStationMin() {
        Radio radio = new Radio();
        radio.setAnyStation(-1);
        assertEquals(0, radio.getNumbStation());
    }

    @Test
    public void findStationMax() {
        Radio radio = new Radio();
        radio.setAnyStation(10);
        assertEquals(0, radio.getNumbStation());
    }

    @Test
    public void pressNextStation() {
        Radio radio = new Radio();
        radio.setNumbStation(8);
        radio.nextStation();
        assertEquals(9, radio.getNumbStation());
    }

    @Test
    public void pressNextStationAfterMax() {
        Radio radio = new Radio();
        radio.setNumbStation(9);
        radio.nextStation();
        assertEquals(0, radio.getNumbStation());
    }

    @Test
    void shouldSetPreviousStation() {
        Radio radio = new Radio();
        radio.setNumbStation(1);
        radio.prevStation();
        assertEquals(0, radio.getNumbStation());
    }


    @Test
    public void pressPrevStation() {
        Radio radio = new Radio();
        radio.setNumbStation(0);
        radio.prevStation();
        assertEquals(9, radio.getNumbStation());
    }

    @Test
    public void pressPrevStationAfterMin() {
        Radio radio = new Radio();
        radio.setNumbStation(1);
        radio.prevStation();
        assertEquals(0, radio.getNumbStation());
    }

    @Test
    public void findVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void findVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void pressIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void pressIncreaseVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void pressDecreaseVolumeAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void pressDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }


}