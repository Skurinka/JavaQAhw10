package org.example;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int next;
        if (currentStation == 9) {
            next = 0;
        } else {
            next = currentStation + 1;
        }
        setCurrentStation(next);
    }

    public void previousStation() {
        int previous;

        if (currentStation == 0) {
            previous = 9;
        } else {
            previous = currentStation - 1;
        }
        setCurrentStation(previous);
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int increased;
        if (currentVolume < 10) {
            increased = currentVolume + 1;
        } else {
            increased = currentVolume;
        }
        setCurrentVolume(increased);
    }

    public void decreaseVolume() {
        int decreased;
        if (currentVolume > 0) {
            decreased = currentVolume - 1;
        } else {
            decreased = currentVolume;
        }
        setCurrentVolume(decreased);
    }

}



