public class Radio {

    private int CurrentRadioStationNumber; // Номер текущей радиостанции

    private int SoundVolume;  // Громкость звука

    public Radio() {
        this.CurrentRadioStationNumber = 0; // Начальная радиостанция

        this.SoundVolume = 0; // Начальный уровень громкости
    }

    // Метод для переключения на следующую станцию

    public void next() {
        if (CurrentRadioStationNumber == 9) {
            CurrentRadioStationNumber = 0;    // Если текущая станция 9, переключаем на 0
        } else {
            CurrentRadioStationNumber++;     // Иначе просто увеличиваем номер станции;
        }
    }


// Метод для переключения на предыдущую станцию

    public void prev() {
        if (CurrentRadioStationNumber == 0) {
            CurrentRadioStationNumber = 9;     // Если текущая станция 0, переключаем на 9
        } else {
            CurrentRadioStationNumber--;      // Иначе просто уменьшаем номер станции
        }
    }

// Метод сеттер для установки номера радиостанции с проверкой

    public void setCurrentRadioStationNumber(int station) {
        if (station >= 0 && station <= 9) {
            this.CurrentRadioStationNumber = station; // Устанавливаем номер станции, если он допустим
        } else {
            System.out.println("Номер радиостанции должен быть в диапазоне от 0 до 9.");
        }
    }

    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.SoundVolume = volume; // Устанавливаем уровень громкости если он допустим
        } else {
            System.out.println("Уровень громкости должен быть в диапазоне от 0 до 100.");
        }
    }


    // Метод для увелечения громкости на 1

    public void increaseVolume() {
        if (SoundVolume < 100) {
            SoundVolume++; // Увеличиваем громкость, если она меньше 100
        }
    }

    // Метод для уменьшения громкости на 1

    public void decreaseVolume() {
        if (SoundVolume > 0) {
            SoundVolume--; // Уменьшаем громкость если она больше одного
        }
    }

// Геттеры для полученя текущих значений

    public int getCurrentRadioStationNumber() {
        return CurrentRadioStationNumber;
    }

    public int getSoundVolume() {
        return SoundVolume;
    }
}

