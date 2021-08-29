package ru.netology;

public class Radio {
    private boolean on = false;
    private String radioName = "NotName";
    private int id;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = (minStation + maxStation) / 2;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 10;


    public Radio(boolean on, int id) {
        this.on = on;
        this.id = id;
    }

    public Radio(String radioName, boolean on, int id) {
        this.radioName = radioName;
        this.on = on;
        this.id = id;
    }


    public Radio(int id, String radioName, int minStation, int maxStation, int currentStation, int minVolume, int maxVolume, int currentVolume, boolean on) {
        this.id = id;
        this.radioName = radioName;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
        this.on = on;
    }

    //Radio Management


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public String getRadioName() {
        return radioName;
    }

    public void setRadioName(String radioNames) {
        this.radioName = radioNames;
        return;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMaxStation() {
        this.currentStation = maxStation;
        return;
    }

    public void setMinStation() {
        this.currentStation = minStation;
        return;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setNextStation() {
        currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        return;
    }

    public void setBackStation() {
        currentStation = currentStation - 1;
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        return;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    // Velum level management
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxVolume() {
        this.currentVolume = maxVolume;
        return;
    }

    public void setMinVolume() {
        this.currentVolume = minVolume;
        return;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

}
