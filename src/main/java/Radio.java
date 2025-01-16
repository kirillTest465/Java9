public class Radio {

    private int numStation; // Количество радиостанций

    private int currentRadioStationNumber; // Номер текущей радиостанции

    private int soundVolume;  // Громкость звука

    public Radio() {

        this.numStation = 10; //  количество радиостанций по умолчанию

        this.currentRadioStationNumber = 0; // Начальная радиостанция

        this.soundVolume = 0; // Начальный уровень громкости
    }

    public Radio(int numStation) {    // Конструктор принимающий на вход количество радиостанций
        if (numStation > 0) {
            this.numStation = numStation;  // Если количесто радиостанций больше 0 то устанавливае
        } else {                          // Если меньше 0 устанавливаем радиостанций по умолчанию
            this.numStation = 10;
        }
    }


    // Метод для переключения на следующую станцию

    public void next() {
        if (currentRadioStationNumber == numStation) {   // Если номер станции больше или равен 0 то переключаем на следующую
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

// Метод для переключения на предыдущую станцию

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = numStation;     // Если текущая станция 0, то переключаем на количество станций
        } else {
            currentRadioStationNumber--;      // Иначе просто уменьшаем номер станции
        }
    }

    // Метод сеттер для установки номера радиостанции с проверкой

    public void setCurrentRadioStationNumber(int station) {
        if (station >= 0 && station <= numStation) {
            currentRadioStationNumber = station; // Устанавливаем номер станции, если он допустим
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

    public int getNumStation() {
        return numStation;
    }
}

