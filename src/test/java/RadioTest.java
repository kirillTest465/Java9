import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void InitialRadioStationTest() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void InitialVolumeLevelTest() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest1() {
        Radio radio = new Radio(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void nextTest2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevTest1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.prev();
        int expected = 10;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setCurrentRadioStationNumberTest2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void setCurrentRadioStationNumberTest3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 10;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setCurrentRadioStationNumberTest1() {
        Radio radio = new Radio(9);
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setCurrentRadioStationNumberTest4() {
        Radio radio = new Radio(9);
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest1() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeTest2() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeTest1() {
        Radio radio = new Radio();
        radio.setSoundVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeTest2() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setSoundVolume1() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setSoundVolume2() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void numStationTest() {
        Radio radio = new Radio(-1);
        int expected = 10;
        int actual = radio.getNumStation();

    }

    @Test
    public void numStationTest2() {
        Radio radio = new Radio(12);
        int expected = 12;
        int actual = radio.getNumStation();

    }
}





