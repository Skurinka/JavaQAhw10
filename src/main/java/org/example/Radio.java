package org.example;

public class Radio {

    private int maxStation;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int amountOfStations) {
        maxStation = (minStation + amountOfStations) - 1;
        this.maxStation = maxStation;
        this.minStation = minStation;
    }


    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int next;
        if (currentStation == maxStation) {
            next = minStation;
        } else {
            next = currentStation + 1;
        }
        setCurrentStation(next);
    }

    public void previousStation() {
        int previous;

        if (currentStation == minStation) {
            previous = maxStation;
        } else {
            previous = currentStation - 1;
        }
        setCurrentStation(previous);
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int increased;
        if (currentVolume < maxVolume) {
            increased = currentVolume + 1;
        } else {
            increased = currentVolume;
        }
        setCurrentVolume(increased);
    }

    public void decreaseVolume() {
        int decreased;
        if (currentVolume > minVolume) {
            decreased = currentVolume - 1;
        } else {
            decreased = currentVolume;
        }
        setCurrentVolume(decreased);
    }

    public int setMaxStation() {
        currentStation = maxStation;
        return currentStation;
    }

}




