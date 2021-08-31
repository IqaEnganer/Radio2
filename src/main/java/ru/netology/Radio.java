package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private boolean on;
    private String radioName = "NotName";
    private int id;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = (minStation + maxStation) / 2;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 10;

}
