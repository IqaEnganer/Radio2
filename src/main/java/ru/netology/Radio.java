package ru.netology;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;

    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;



    //Radio Management
    public void setMaxStation(){
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

    public void setNextStation(){
        currentStation = currentStation + 1;
        if (currentStation > maxStation){
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public void setBackStation(){
        currentStation = currentStation - 1;
        if (currentStation <= minStation){
            currentStation = maxStation;
        }
         this.currentStation=currentStation;
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
    public int getCurrentVolume(){
        return currentVolume;
    }
    public void setMaxVolume(){
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
    public void setDecreaseVolume(int currentVolume) {
        currentVolume = currentVolume-1;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume ;
    }

}
