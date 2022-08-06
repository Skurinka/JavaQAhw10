import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldSetStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetVolume() {
        Radio radio = new Radio(30);

        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetUpZeroAboveStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetUpNext() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetUpPrev() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(9);
        radio.previousStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetUpNinePrev() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(0);
        radio.previousStation();

        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldNotIncreaseAbove100() {

        Radio radio = new Radio(30);

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldIncreaseVolume() {

        Radio radio = new Radio(30);

        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolume() {

        Radio radio = new Radio(30);

        radio.setCurrentVolume(4);
        radio.decreaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotDecreaseBellowZero() {

        Radio radio = new Radio(30);

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetStationBellowZero() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(-6);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetStationAbove30() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(30);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeBellow0() {

        Radio radio = new Radio(30);

        radio.setCurrentVolume(-6);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeAbove10() {

        Radio radio = new Radio(30);

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetUpMaxStationProperly() {
        Radio radio = new Radio(15);

        radio.setMaxStation();
        int expected = 14;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}
