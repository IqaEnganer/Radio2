package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.Record;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio rad = new Radio();

    // Test stations
    // Switching by buttons
    @Test
    public void isOn() {
        assertEquals(false, rad.isOn());
    }

    @Test
    public void showBackStation() {
        rad.getCurrentStation();
        rad.setBackStation();
        assertEquals(3, rad.getCurrentStation());
    }

    @Test
    public void setMinStation() {
        rad.setMinStation();
        assertEquals(0, rad.getCurrentStation());
        ;
    }

    @Test
    public void setMaxStation() {
        rad.setMaxStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationTwo() {
        rad.setMaxStation();
        rad.setCurrentStation(10);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationThree() {
        rad.setMinStation();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    //Next , Back station .
    @Test
    public void setNextStation() {
        rad.setNextStation();
        int expected = 5;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setNextStationTwo() {
        rad.setMaxStation();
        rad.setNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setBackStation() {
        rad.setMinStation();
        rad.setBackStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setBackStationTwo() {
        rad.getCurrentStation();
        rad.setBackStation();
        int expected = 3;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    //Test volume

    @Test
    public void setMaxVelume() {
        rad.setMaxVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setMinVolume() {
        rad.setMinVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseVolume() {
        rad.setIncreaseVolume();
        int expected = 11;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeTwo() {
        rad.setMaxVolume();
        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolume() {
        rad.setMinVolume();
        rad.setDecreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setDecreaseVolumeTwo() {
        rad.setMaxVolume();
        rad.setDecreaseVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setRadioName() {
        rad.setRadioName("RadioRecord");
        String expected = "RadioRecord";
        String actual = rad.getRadioName();
        assertEquals(actual, expected);
    }

    @Test
    void getOn() {
        rad.setOn(true);
        boolean expected = true;
        boolean actual = rad.isOn();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldInitFields() {
        Radio radio = new Radio();
        Radio radio1 = new Radio(15);
        assertEquals(10, radio.getNumberOfRadioStation());
        assertEquals("NotName", radio.getRadioName());
        assertEquals(0, radio.getMinStation());
        assertEquals(9, radio.getMaxStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(4, radio.getCurrentStation());
        assertEquals(10, radio.getCurrentVolume());
        assertEquals(false, radio.isOn());
        assertEquals(0, radio.getId());
        assertEquals(15, radio1.getNumberOfRadioStation());


    }
}

