/* Классы и объекты */

// Определили новый класс 'Person':

public class Program {
    public static void main(String[] args) {
        Person tom = new Person();  // создание объекта.
        tom.displayInfo();

        // Изменим имя и возраст:
        tom.name = "Egor";
        tom.age = 19;

        Person tom2 = new Person();
        tom2.name = "Ilya";
        tom2.age = 20;

        tom.displayInfo();
        tom2.displayInfo();

        // Выше я хотел показать то, как работает модификатор 'static'.
        // Если в классе 'Person' объявить значения и метод с помощью 'static', то
        // тогда при создании в 'main' разных переменных с классом 'Person' и присваивании им
        // значений при выводе всех этих переменных будут напечатаны последние значения, присвоенные
        // в последнюю переменную. ТАКИЕ ДЕЛА :)

        Person bob = new Person("Bob");
        bob.displayInfo();

        Person sam = new Person("Sam", "Williams", 17);
        sam.displayInfo();
    }
}

/*
class Person {
    static String name;    // имя.
    static int age;        // возраст.
    static void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
*/

/*
class Person {
    String name;    // имя.
    int age;        // возраст.

    Person() {
        name = "Danya";
        age = 22;
    }

    Person(String n) {
        name = n;
        age = 22;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
*/


// Ключевое слово 'this':

class Person {
    String name;    // имя.
    String name2;
    int age;        // возраст.

    Person() {
        this("Danya", "Stanislavovich", 22);
    }

    Person(String n) {
        this(n, "Gorbachev", 22);
    }

    Person(String name, String name2, int age) {
        this.name = name;
        this.name2 = name2;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tName2: %s \tAge: %d\n", name, name2, age);
    }
}

