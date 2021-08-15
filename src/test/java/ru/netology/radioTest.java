package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Comments
class RadioTest {
    // Test stations
    // Switching by buttons
    @Test
    public void setMinStation() {
        Radio rad = new Radio();
        rad.setMinStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setMaxStation() {
        Radio rad = new Radio();
        rad.setMaxStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation(){
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }


    //Next , Back station .
    @Test
    public void setNextStation (){
        Radio rad = new Radio();
        rad.setNextStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setNextStationTwo (){
        Radio rad = new Radio();
        rad.setNextStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void setBackStation (){
        Radio rad = new Radio();
        rad.setBackStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setBackStationTwo (){
        Radio rad = new Radio();
        rad.setBackStation();
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    //Test volume

  @Test
    public void setMaxVelume (){
        Radio rad = new Radio();
        rad.setMaxVolume();
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void getCurrentVolume (){
        Radio rad = new Radio();
        rad.getCurrentVolume();
        int expected = rad.getCurrentVolume();;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setMinVolume(){
        Radio rad = new Radio();
        rad.setMinVolume();
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setIncreaseVolume(){
        Radio rad = new Radio();
        rad.setIncreaseVolume();
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setIncreaseVolumeTho(){
        Radio rad = new Radio();
        rad.setIncreaseVolume();
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setDecreaseVolume(){
        Radio rad = new Radio();
        rad.setDecreaseVolume(0);
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setDecreaseVolumeTwo(){
        Radio rad = new Radio();
        rad.setDecreaseVolume(4);
        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
}
