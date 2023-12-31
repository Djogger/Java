public class Main {
    public static void main(String args[]) {
        variables();
        data_type();
    }

    /*Переменные и константы.*/
    public static void variables() {
        int x;
        x = 10;
        System.out.println(x); // 10.

        x = 19;
        System.out.println(x); // 19.

    // Ключевое слово 'var':
        // 'var' заменяет и сама определяет тип переменной:
        var x1 = 5;
        System.out.println(x1); // 5.

    // Константы:
        // константа объявляется так же, как и переменная, только вначале идёт ключевое слово 'final':
        final int LIMIT = 25;
        // LIMIT = 5; А вот так уже не сработает)) это же константа.
    }


    /*Типы данных.*/
    public static void data_type() {
        // 1) boolean: хранит true, false:
        boolean isAlive = true;
        boolean isActive = false;

        // 2) byte: хранит целое число от -128 до 127 и занимает 1 байт:
        byte a = 3;
        byte b = 8;

        // 3) short: хранит целое число от -32768 до 32767 и занимает 2 байт:
        short a1 = 3;
        short b1 = 8;

        // 4) int: хранит целое число от -2 147 483 648 до 2 147 483 647 и занимает 4 байта:
        int a2 = 4;
        int b2 = 9;

        // 5) long: хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и
        // занимает 8 байт:
        long a3 = 4;
        long b3 = 5;

        // 6) double: хранит число с плавающей точкой от ±4.9*10^(-324) до ±1.7976931348623157*10^(308) и
        // занимает 8 байт:
        double x = 8.5;
        double y = 2.7;

        // 7) float: хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта:
        float x1 = 8.5F;
        float x2 = 2.7F;

        // 8) char: хранит одиночный символ в кодировке UTF-16 и
        // занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535:
        char z = 'a';


        /* Целые числа: */

        byte a4 = 1;
        short b4 = 2;
        long c = 234234245;

        long c1 = 2342342455L; // тут число выходит за пределы 'int', поэтому, чтобы всё заработало,
                               // мы приписываем в конце приставку 'L', чтобы число воспринималось, как тип 'long',
                               // который вмещает в себе куда больше, чем тип 'int'.

        // Можно применять другие системы счисления:
        int num111 = 0x6F; // 16-теричная система (0x), число 111.
        int num8 = 010; // 8-ричная система (0), число 8.
        int num13 = 0b1101; // 2-ичная система (0b), число 13.

        // Целые числа поддерживают разделение разрядов числа с помощью знака подчёркивания '_':
        int x3 = 123_456;
        int y3 = 234_567_789;
        System.out.println(x3);
        System.out.println(y3);

        // Числа с плавающей точкой:
        float fl = 30.6f;
        double db = 30.6;

        // Символы и строки:
        char ch = 'f';
        char ch1 = 102;
        System.out.println(ch1); // Выведет: 'f'.

        String hello_world = "Hello, World!";
        System.out.println(hello_world);

        String hello_world1 = "Hello, \nWorld!";
        System.out.println(hello_world1);

        String text = """
                       А служба -- службою везде,
                       И на земле, и на воде,
                       И друга верная рука с тобой в любой бе-де,
                       А если очень повезёт, тебя дорога приведёт,
                       На доблестный российский фло-о-от,
                       На доблестный российский фло-о-от,
                       На доблестный российский флот!
                      """;
        System.out.println(text);
    }


    /*Консольный ввод/вывод.*/
    public static void con_input_output() {
        // Класс 'System' применяется для того, чтобы взаимодействовать с консолью
    }
}
