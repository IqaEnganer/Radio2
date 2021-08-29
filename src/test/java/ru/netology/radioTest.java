package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.Record;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio rad = new Radio("RadioRecord", true, 1);

    // Test stations
    // Switching by buttons
    @Test
    public void isOn() {
        assertEquals(true, rad.isOn());
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
        assertEquals(0, rad.getCurrentStation());;
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
        Radio radio = new Radio(125, "radio", 10, 9, 4, 0, 100, 50, true);
        assertEquals("radio", radio.getRadioName());
        assertEquals(10, radio.getMinStation());
        assertEquals(9, radio.getMaxStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(4, radio.getCurrentStation());
        assertEquals(50, radio.getCurrentVolume());
        assertEquals(true, radio.isOn());
        assertEquals(125, radio.getId());

    }

    @Test
    public void showDefaultValues() {

        Radio rad = new Radio(true, 235);
        assertEquals(0, rad.getMinStation());
        assertEquals(100, rad.getMaxVolume());
        assertEquals(9, rad.getMaxStation());
        assertEquals(235, rad.getId());
        assertEquals(0, rad.getMinStation());
        assertEquals(4, rad.getCurrentStation());
        assertEquals(10, rad.getCurrentVolume());
        assertEquals("NotName", rad.getRadioName());

    }
}

