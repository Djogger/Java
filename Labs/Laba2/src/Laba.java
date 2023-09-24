public class Laba {
    public static void main(String[] args) {
        lightCar car = new lightCar(1935, "Cadillac", 1300000);
        System.out.printf("weight: %d(кг.) \tbrand: %s \tcost: %d(руб.)\n", car.weight, car.brand, car.cost);

        car.hello();

        lightCarInformation vehicle = new lightCarInformation("USA", 2007, true);
        System.out.printf("country: %s \tyear: %d \tquality: %b\n\n", vehicle.country, vehicle.year, vehicle.quality);


        truck car2 = new truck(11845, "КамАЗ", 4800000);
        System.out.printf("weight: %d(кг.) \tbrand: %s \tcost: %d(руб.)\n", car2.weight, car2.brand, car2.cost);

        truckInformation vehicle2 = new truckInformation("Российская Федерация", 1995, true);
        System.out.printf("country: %s \tyear: %d \tquality: %b\n\n", vehicle2.country, vehicle2.year, vehicle2.quality);


        truck bike = new truck(206, "Aprilia Tuono V4", 1300000);
        System.out.printf("weight: %d(кг.) \tbrand: %s \tcost: %d(руб.)\n", bike.weight, bike.brand, bike.cost);

        truckInformation vehicle3 = new truckInformation("Италия", 2019, true);
        System.out.printf("country: %s \tyear: %d \tquality: %b\n\n", vehicle3.country, vehicle3.year, vehicle3.quality);
    }
}

abstract class Vehicle {
    int weight;
    String brand;
    int cost;

    public Vehicle(int weight, String brand, int cost) {
        this.weight = weight;
        this.brand = brand;
        this.cost = cost;
    }

    void hello() {
        System.out.println("Hello!");
    }
}

class lightCar extends Vehicle {
    String country;
    int year;
    boolean quality; // Качественно ли сделана.

    /** Конструктор по умолчанию **/
    public lightCar() {
        super(0, "", 0);
    }

    public lightCar(int x, String y, int z) {
        super(x, y, z);
    }
}
class lightCarInformation extends lightCar {
    /** Конструктор по умолчанию **/
    public lightCarInformation() {
        super.country = "";
        super.year = 0;
        super.quality = false;
    }

    public lightCarInformation(String country, int year, boolean quality) {
        super.country = country;
        super.year = year;
        super.quality = quality;
    }
}

class truck extends Vehicle {
    String country;
    int year;
    boolean quality; // Качественно ли сделана.

    /** Конструктор по умолчанию **/
    public truck() {
        super(0, "", 0);
    }

    public truck(int x, String y, int z) {
        super(x, y, z);
    }
}
class truckInformation extends truck {
    /** Конструктор по умолчанию **/
    public truckInformation() {
        super.country = "";
        super.year = 0;
        super.quality = false;
    }

    public truckInformation(String country, int year, boolean quality) {
        super.country = country;
        super.year = year;
        super.quality = quality;
    }
}

class motorbike extends Vehicle {
    String country;
    int year;
    boolean quality; // Качественно ли сделана.

    /** Конструктор по умолчанию **/
    public motorbike() {
        super(0, "", 0);
    }

    public motorbike(int x, String y, int z) {
        super(x, y, z);
    }
}
class motorbikeInformation extends truck {
    /** Конструктор по умолчанию **/
    public motorbikeInformation() {
        super.country = "";
        super.year = 0;
        super.quality = false;
    }

    public motorbikeInformation(String country, int year, boolean quality) {
        super.country = country;
        super.year = year;
        super.quality = quality;
    }
}

// !!!!! ДОДЕЛАТЬ РАБОТУ !!!!!
/*
- абстрактный класс
   ???  - 2 уровня наследуемых классов (классы должны содержать в
        себе минимум 3 поля и 2 метода, описывающих поведение
        объекта)
        - демонстрацию реализации всех принципов ООП (абстракция,
        модификаторы доступа, перегрузка, переопределение)
        - наличие геттеров и сеттеров
   ???  - ввод/вывод информации о создаваемых объектах
   ???  - предусмотрите в одном из классов создание счетчика
        созданных объектов с использованием статической
        переменной, продемонстрируйте работу*/
