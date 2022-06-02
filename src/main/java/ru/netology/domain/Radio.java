package ru.netology.domain;

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
        int newCurrentStation;
        if (numbStation < 9) {
            newCurrentStation = numbStation + 1;
        } else {
            newCurrentStation = 0;
        }
        setNumbStation(newCurrentStation);
    }


    public void prev() {
        int newCurrentStation;
        if (numbStation > 0) {
            newCurrentStation = numbStation - 1;
        } else {
            newCurrentStation = 9;
        }
        setNumbStation(newCurrentStation);
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
        int newCurrentVolume = currentVolume + 1;
        setVolume(newCurrentVolume);

    }

    public void decreaseVolume() {
        int newCurrentVolume = currentVolume - 1;
        setVolume(newCurrentVolume);

    }
}


