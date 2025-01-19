public class Radio {

    private int currentStation; //  текущей радиостанции

    private int soundVolume;  // Громкость звука

    private int maxStation; // Максимальная станция

    public Radio() {

        this.maxStation = 9;
    }

    public Radio(int stationCount) {    // Конструктор принимающий на вход количество радиостанций
        this.maxStation = stationCount - 1;
    }


    // Метод для переключения на следующую станцию

    public void next() {
        if (currentStation == maxStation) {   // Если номер станции больше или равен 0 то переключаем на следующую
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

// Метод для переключения на предыдущую станцию

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStation;     // Если текущая станция 0, то переключаем на количество станций
        } else {
            currentStation--;      // Иначе просто уменьшаем номер станции
        }
    }

    // Метод сеттер для установки номера радиостанции с проверкой

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
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


    // Метод для увелечения громкости на 1

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume++; // Увеличиваем громкость, если она меньше 100
        }
    }

    // Метод для уменьшения громкости на 1

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume--; // Уменьшаем громкость если она больше нуля
        }
    }

// Геттеры для полученя текущих значений

    public int getCurrentRadio() {
        return currentStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }
}

