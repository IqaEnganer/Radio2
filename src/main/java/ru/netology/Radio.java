package ru.netology;


public class Radio {


    private int numberOfStations = 10;
    private boolean on;
    private String radioName = "NotName";
    private int id;
    private int minStation = 0;
    private int maxStation = numberOfStations - 1;
    private int currentStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 10;


    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStation = numberOfStations - 1;
    }

    public Radio() {
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

    public int getNumberOfStations() {
        return numberOfStations;
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


    public int getMaxStation() {
        return maxStation;
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
        this.currentStation = maxStation;
    }

    public void setMinStation() {
        this.currentStation = minStation;
    }

    public void setMaxVolume() {
        this.currentVolume = maxVolume;
    }

    public void setMinVolume() {
        this.currentVolume = minVolume;
    }

}


