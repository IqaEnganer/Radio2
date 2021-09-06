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
    private int maxStationAndQuantity = 9;
    private int currentStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 10;


    public void setNextStation() {
        currentStation = currentStation + 1;
        if (currentStation > maxStationAndQuantity) {
            currentStation = minStation;
        }
        return;
    }

    public void setBackStation() {
        currentStation = currentStation - 1;
        if (currentStation < minStation) {
            currentStation = maxStationAndQuantity;
        }
        return;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStationAndQuantity) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void setIncreaseVolume() {
        currentVolume = currentVolume + 1;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        return;
    }

    public void setDecreaseVolume() {
        currentVolume = currentVolume - 1;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        return;
    }

}
