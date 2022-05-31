package ru.netology.statistic;

public class Radio {
    private int numbStation;
    private int currentVolume;

    public void setNumbStation(int numbStation) {
        if (numbStation < 0) {
            return;
        }
        if (numbStation > 9) {
            return;
        }
        this.numbStation = numbStation;

    }

    public int getNumbStation() {
        return numbStation;

    }

    public void next() {
        //int newCurrentStation = 0;
        if (numbStation < 9) {
            numbStation = numbStation + 1;
        }
    }


    public void prev() {
        //int newCurrentStation = 0;
        if (numbStation > 0) {
            numbStation = numbStation - 1;
        }
    }


    public void setVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public int getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}


