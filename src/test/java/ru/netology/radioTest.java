package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.Record;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void showStatistic() {
        Radio rad = new Radio();
        Radio rad2 = new Radio(true , "RadioRec", 25, 10, 20, 4,
                0 , 100 , 10);
        assertEquals(false, rad.isOn());
        assertEquals("NotName", rad.getRadioName());
        rad.setCurrentStation(7);
        assertEquals(7, rad.getCurrentStation());
        assertEquals(0, rad.getMinStation());
        assertEquals(9, rad.getMaxStation());
        rad.setCurrentStation(9+1);
        assertEquals(10,rad.getCurrentStation());
        assertEquals(100, rad.getMaxVolume());
        assertEquals(100, rad2.getMaxVolume());
        assertEquals(true, rad2.isOn());
        assertEquals("RadioRec", rad2.getRadioName());
        assertEquals(25, rad2.getId());
        assertEquals(10, rad2.getMinStation());

    }


}

