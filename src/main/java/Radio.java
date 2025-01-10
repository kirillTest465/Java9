public class Radio {

    private int currentRadioStationNumber; // Номер текущей радиостанции

    private int soundVolume;  // Громкость звука

    public Radio() {
        this.currentRadioStationNumber = 0; // Начальная радиостанция

        this.soundVolume = 0; // Начальный уровень громкости
    }

    // Метод для переключения на следующую станцию

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;    // Если текущая станция 9, переключаем на 0
        } else {
            currentRadioStationNumber++;     // Иначе просто увеличиваем номер станции;
        }
    }


// Метод для переключения на предыдущую станцию

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;     // Если текущая станция 0, переключаем на 9
        } else {
            currentRadioStationNumber--;      // Иначе просто уменьшаем номер станции
        }
    }

// Метод сеттер для установки номера радиостанции с проверкой

    public void setCurrentRadioStationNumber(int station) {
        if (station >= 0 && station <= 9) {
            this.currentRadioStationNumber = station; // Устанавливаем номер станции, если он допустим
        } else {
            System.out.println("Номер радиостанции должен быть в диапазоне от 0 до 9.");
        }
    }

    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume; // Устанавливаем уровень громкости если он допустим
        } else {
            System.out.println("Уровень громкости должен быть в диапазоне от 0 до 100.");
        }
    }


    // Метод для увелечения громкости на 1

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume++; // Увеличиваем громкость, если она меньше 100
        }
    }

    // Метод для уменьшения громкости на 1

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume--; // Уменьшаем громкость если она больше одного
        }
    }

// Геттеры для полученя текущих значений

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }
}

