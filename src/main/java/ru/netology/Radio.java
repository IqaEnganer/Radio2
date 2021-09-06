package ru.netology;


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

    public Radio(int maxStationAndNumber) {
        this.maxStationAndQuantity = maxStationAndNumber;
    }

    public Radio() {
    }

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

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getRadioName() {
        return radioName;
    }

    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinStation() {
        return minStation;
    }


    public int getMaxStationAndQuantity() {
        return maxStationAndQuantity;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public int getMaxVolume() {
        return maxVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxStation() {
        this.currentStation = maxStationAndQuantity;
    }
    public void setMinStation(){
        this.currentStation = minStation;
    }
    public void setMaxVolume(){
        this.currentVolume = maxVolume;
    }

    public void setMinVolume() {
        this.currentVolume = minVolume;
    }

}


