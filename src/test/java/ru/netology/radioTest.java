package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {
    // Test stations
    // Switching by buttons
    @Test
    public void getMinStation() {
        radio rad = new radio();
        int expected = rad.getMinStation();
        int actual = rad.getMinStation();
        assertEquals(expected, actual);
    }
    @Test
    public void getMaxStation() {
        radio rad = new radio();
        int expected = rad.getMaxStation();
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setOneStation (){
        radio rad = new radio();
        rad.setOneStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setTwoStation (){
        radio rad = new radio();
        rad.setTwoStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setThreeStation (){
        radio rad = new radio();
        rad.setThreeStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setForStation (){
        radio rad = new radio();
        rad.setForStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setFiveStation (){
        radio rad = new radio();
        rad.setFiveStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setSixStation (){
        radio rad = new radio();
        rad.setSixStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setSevenStation (){
        radio rad = new radio();
        rad.setSevenStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setEightStation (){
        radio rad = new radio();
        rad.setEightStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setNineStation (){
        radio rad = new radio();
        rad.setNineStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }


    //Next , Back station .
    @Test
    public void setNextStation (){
        radio rad = new radio();
        rad.setNextStation(9);
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setNextStationTwo (){
        radio rad = new radio();
        rad.setNextStation(7);
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setBackStation (){
        radio rad = new radio();
        rad.setBackStation(0);
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setBackStationTwo (){
        radio rad = new radio();
        rad.setBackStation(5);
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    //Test volume

  @Test
    public void setMaxVelume (){
        radio rad = new radio();
        rad.setMaxVolume();
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void getCurrentVolume (){
        radio rad = new radio();
        rad.getCurrentVolume();
        int expected = rad.getCurrentVolume();;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setMinVolume(){
        radio rad = new radio();
        rad.setMinVolume();
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setIncreaseVolume(){
        radio rad = new radio();
        rad.setIncreaseVolume(10);
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setIncreaseVolumeTho(){
        radio rad = new radio();
        rad.setIncreaseVolume(8);
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setDecreaseVolume(){
        radio rad = new radio();
        rad.setDecreaseVolume(0);
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setDecreaseVolumeTwo(){
        radio rad = new radio();
        rad.setDecreaseVolume(4);
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
}
