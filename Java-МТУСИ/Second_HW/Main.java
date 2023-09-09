import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
    // Задание 1:
        System.out.println("Задание 1:");
        System.out.println(duplicateChars("Donald"));
        System.out.println(duplicateChars("orange"));

    // Задание 2:
        System.out.println("\nЗадание 2:");
        getInitials("Ryan Gosling");
        getInitials("Barack Obama"); // в задании опечатка, должно быть "BO".

    // Задание 3:
        System.out.println("\nЗадание 3:");
        System.out.println(differenceEvenOdd(new int[] {44, 32, 86, 19}));
        System.out.println(differenceEvenOdd(new int[] {22, 50, 16, 63, 31, 55}));

    // Задание 4:
        System.out.println("\nЗадание 4:");
        System.out.println(equalToAvg(new int[] {1, 2, 3, 4, 5}));
        System.out.println(equalToAvg(new int[] {1, 2, 3, 4, 6}));

    // Задание 5:
        System.out.println("\nЗадание 5:");
        System.out.println(indexMult(new int[] {1, 2, 3}));
        System.out.println(indexMult(new int[] {3, 3, -2, 408, 3, 31}));

    // Задание 6:
        System.out.println("\nЗадание 6:");
        System.out.println(reverse("Hello World"));
        System.out.println(reverse("The quick brown fox."));

    // Задание 7:
        System.out.println("\nЗадание 7:");
        System.out.println(Tribonacci(7));
        System.out.println(Tribonacci(11));

    // Задание 8:
        System.out.println("\nЗадание 8:");
        System.out.println(pseudoHash(5));
        System.out.println(pseudoHash(10));
        System.out.println(pseudoHash(0));

    // Задание 9:
        System.out.println("\nЗадание 9:");
        System.out.println(botHelper("Hello, I'm under the water, please help me."));
        System.out.println(botHelper("I have two number nine, number nine large, " +
                "number six with extra dip, number seven, two number fourty-five, " +
                "one with cheese and a large sooooodaaaaa"));

    // Задание 10:
        System.out.println("\nЗадание 10:");
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("eleven plus two", "twelve plus one"));
        System.out.println(isAnagram("hello", "world"));
    }

    public static boolean duplicateChars(String str) {
        char[] chars = str.toLowerCase().toCharArray();

        boolean bool = false;

        m: for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (chars[i] == chars[j]) {
                    bool = true;
                    break m;
                }
            }
        }

        return bool;
    }

    static void getInitials(String x) {
        char[] chars = x.toCharArray();

        String itog = "";

        for (int i = 0; i < x.length(); i++) {
            String letter = String.valueOf(chars[i]); // метод '.valueof()' возвращает тот тип, который указан
                                                      // перед точкой.
            if (letter != letter.toLowerCase()) itog += letter;
        }

        System.out.println(itog);
    }

    public static int differenceEvenOdd(int[] x) {
        int even_number = 0;
        int odd_number = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                even_number += x[i];
                continue;
            }
            odd_number += x[i];
        }

        int itog = even_number - odd_number;

        return (itog > 0) ? itog : itog * (-1);
    }

    public static boolean equalToAvg(int[] x) {
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        double average_number = (double) sum / x.length;
        boolean bool = false;

        for (int i = 0; i < x.length; i++) {
            if (average_number == x[i]) {
                bool = true;
            }
        }

        return bool;
    }

    static String indexMult(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * i;
        }

        return Arrays.toString(x);
    }

    static String reverse(String x) {
        char[] chars = x.toCharArray();

        String itog = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            itog += chars[i];
        }

        return itog;
    }

    public static int Tribonacci(int x) {
        int[] array = new int[x];

        if (x > 2) {
            array[0] = 0;
            array[1] = 0;
            array[2] = 1;

            for (int i = 3; i < x; i++) {
                array[i] = array[i-1] + array[i-2] + array[i-3];
            }
        } else {
            array[0] = 0;
        }

        return array[x-1];
    }

    public static String pseudoHash(int x) {
        char[] str = "abcdef0123456789".toCharArray();

        String Hash = "";

        Random rnd = new Random();

        if (x > 0) {
            for (int i = 0; i < x; i++) {
                int rnd_num = rnd.nextInt(str.length - 1);
                Hash += str[rnd_num];
            }
        }

        return Hash;
    }

    public static String botHelper(String x) {
        int index = x.indexOf("help");

        String itog = "";

        if (index == -1) {
            itog += "Keep waiting";
        } else {
            itog += "Calling for a staff member";
        }

        return itog;
    }

    public static boolean isAnagram(String x, String y) {
        char[] chars_x = x.toCharArray();
        char[] chars_y = y.toCharArray();
        Arrays.sort(chars_x);
        Arrays.sort(chars_y);

        if (chars_x.length == chars_y.length) return Arrays.equals(chars_x, chars_y);

        return false;
    }
}


