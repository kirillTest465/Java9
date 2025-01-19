import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void getRadioStationTest() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getsoundVolumeTest() {
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
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void nextTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void prevTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setCurrentRadioTest1() {
        Radio radio = new Radio(9);
        int expected = 8;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setCurrentRadioTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setCurrentRadioTest4() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadio();
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
    public void maxStationTest() {
        Radio radio = new Radio(-1);
        int expected = 10;
        int actual = radio.getMaxStation();

    }

    @Test
    public void maxStationTest2() {
        Radio radio = new Radio(12);
        int expected = 12;
        int actual = radio.getMaxStation();

    }
}





