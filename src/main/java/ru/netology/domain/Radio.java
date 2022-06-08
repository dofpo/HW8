package ru.netology.domain;

public class Radio {
    private int numbStation;
    private int currentVolume;

    private int stationsQuantity;


    public Radio(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public Radio() {
        this.stationsQuantity = 10;
    }

    public int getQuantityOfStations() {
        return stationsQuantity;
    }

    public int getNumbStation() {
        return numbStation;
    }

    public void setNumbStation(int numbStation) {
        if (numbStation < 0) {
            return;
        } else if (numbStation >= stationsQuantity) {
            return;
        }
        this.numbStation = numbStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        } else if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setAnyStation(int newStation) {
        setNumbStation(newStation);
    }

    public void nextStation() {
        int newCurrentStation;
        if (numbStation < stationsQuantity - 1) {
            newCurrentStation = numbStation + 1;
        } else {
            newCurrentStation = 0;
        }

        setNumbStation(newCurrentStation);
    }

    public void prevStation() {
        int newCurrentStation;
        if (numbStation > 0) {
            newCurrentStation = numbStation - 1;
        } else {
            newCurrentStation = stationsQuantity - 1;
            ;
        }

        setNumbStation(newCurrentStation);
    }

    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;
        setCurrentVolume(newCurrentVolume);
    }

    public void decreaseVolume() {
        int newCurrentVolume = currentVolume - 1;
        setCurrentVolume(newCurrentVolume);
    }
}



