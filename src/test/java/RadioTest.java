import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void RadioStationNumberTest() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(6);
        int expected = 6;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void belowRadioStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void aboveRadioStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void switchRadioStationNextTest() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(6);
        rad.next();
        int expected = 7;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void switchRadioStationNextBorder() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioStationNextBorderTwo() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioStationPrevTest() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(3);
        rad.prev();
        int expected = 2;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioStationPrevBorder() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioStationPrevBorderTwo() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeTest() {
        Radio rad = new Radio();
        rad.setSoundVolume(-3);
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void soundVolumeTestTwo() {
        Radio rad = new Radio();
        rad.setSoundVolume(167);
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseSoundVolumeTo1Test() {
        Radio rad = new Radio();
        rad.setSoundVolume(54);
        rad.increaseSoundVolumeTo1();
        int expected = 55;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseSoundVolumeTo1Border() {
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        rad.increaseSoundVolumeTo1();
        int expected = 1;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseSoundVolumeTo1BorderTwo() {
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        rad.increaseSoundVolumeTo1();
        int expected = 100;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceSoundVolumeTo1Test() {
        Radio rad = new Radio();
        rad.setSoundVolume(65);
        rad.reduceSoundVolumeTo1();
        int expected = 64;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceSoundVolumeTo1Border() {
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        rad.reduceSoundVolumeTo1();
        int expected = 99;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceSoundVolumeTo1BorderTwo() {
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        rad.reduceSoundVolumeTo1();
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

}
