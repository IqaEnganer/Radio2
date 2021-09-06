package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        rad.setCurrentStation(0);
        rad.setBackStation();
        assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void setMinStation() {
        rad.getMinStation();
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
        rad.setCurrentStation(20);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationTwo() {
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationThree() {
        rad.setMinStation();
        rad.setBackStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    //Next , Back station .
    @Test
    public void setNextStation() {
        rad.setNextStation();
        int expected = 1;
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
        rad.getMinStation();
        rad.setBackStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setBackStationTwo() {
        rad.setCurrentStation(5);
        rad.setBackStation();
        int expected = 4;
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
        radio.setCurrentStation(5);
        assertEquals("NotName", radio.getRadioName());
        assertEquals(0, radio.getMinStation());
        assertEquals(9, radio.getMaxStationAndQuantity());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(5, radio.getCurrentStation());
        assertEquals(10, radio.getCurrentVolume());
        assertEquals(false, radio.isOn());
        assertEquals(0, radio.getId());
        radio.setCurrentVolume(100);
        assertEquals(100,radio.getCurrentVolume());
        radio.setId(2);
        assertEquals(2,radio.getId());
        assertEquals(9,radio.getMaxStationAndQuantity());


    }
    @Test
    public void setNumberStation(){
        Radio rad = new Radio(150);
        assertEquals(150,rad.getMaxStationAndQuantity());
        rad.setMinStation();
        rad.setBackStation();
        assertEquals(150,rad.getCurrentStation());
    }
}

