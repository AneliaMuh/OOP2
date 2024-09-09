public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio( int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public void next() {
        if (currentRadioStationNumber != maxStation) {
            currentRadioStationNumber ++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber --;
        } else {
            currentRadioStationNumber = maxStation;
        }

    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > maxStation) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 100) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseSoundVolumeTo1() {
        if (soundVolume < 100) {
            soundVolume ++;
        } else {
            soundVolume = 100;

        }
    }

    public void reduceSoundVolumeTo1() {
        if (soundVolume > 0) {
            soundVolume --;
        } else {
            soundVolume = 0;
        }
    }
}
