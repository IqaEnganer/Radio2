package ru.netology;

public class radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int OneStation = 1;
    private int TwoStation = 2;
    private int ThreeStation =3 ;
    private int ForStation = 4;
    private int FiveStation = 5;
    private int SixStation = 6;
    private int SevenStation = 7;
    private int EightStation = 8;
    private int NineStation = 9 ;


    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;



    //Radio Management
    public int getMaxStation(){
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setNextStation(int currentStation){
        currentStation = currentStation + 1;
        if (currentStation > maxStation){
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public void setBackStation(int currentStation){
        currentStation = currentStation - 1;
        if (currentStation <= minStation){
            currentStation = maxStation;
        }
         this.currentStation=currentStation;
    }
    public void setOneStation() {
        this.currentStation = OneStation;
        return;
    }
    public void setTwoStation(){
        this.currentStation = TwoStation;
        return;
    }
    public void setThreeStation(){
        this.currentStation = ThreeStation;
        return;
    }
    public void setForStation(){
        this.currentStation = ForStation;
        return;
    }
    public void setFiveStation(){
        this.currentStation = FiveStation;
        return;
    }
    public void setSixStation(){
        this.currentStation = SixStation;
        return;
    }
    public void setSevenStation(){
        this.currentStation = SevenStation;
        return;
    }
    public void setEightStation(){
        this.currentStation = EightStation;
        return;
    }
    public void setNineStation(){
        this.currentStation = NineStation;
        return;
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
    public void setIncreaseVolume(int currentVolume) {
        currentVolume = currentVolume + 1;
        if (currentVolume > maxVolume) {
             currentVolume = maxVolume;
        }
        this.currentVolume=currentVolume;
    }
    public void setDecreaseVolume(int currentVolume) {
        currentVolume = currentVolume-1;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume ;
    }

}
