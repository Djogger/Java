public class Main {
    public static void main(String args[]) {
    // Задание 1:
        System.out.println("Задание 1:");
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));

    // Задание 2:
        System.out.println("\nЗадание 2:");
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));

    // Задание 3:
        System.out.println("\nЗадание 3:");
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));


    // Задание 4:
        System.out.println("\nЗадание 4:");
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));

    // Задание 5:
        System.out.println("\nЗадание 5:");
        System.out.println(ternaryEvalution(8, 4));
        System.out.println(ternaryEvalution(1, 11));
        System.out.println(ternaryEvalution(5, 9));

    // Задание 6:
        System.out.println("\nЗадание 6:");
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));

    // Задание 7:
        System.out.println("\nЗадание 7:");
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));

    // Задание 8:
        System.out.println("\nЗадание 8:");
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28)); // в методичке опечатка, правильный ответ 7.

    // Задание 9:
        System.out.println("\nЗадание 9:");
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));

    // Задание 10:
        System.out.println("\nЗадание 10:");
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }

    public static double convert(int x) {
        return x * 3.785;
    }

    public static int fitCalc(int x, int y) {
        return x * y;
    }

    public static int containers(int x, int y, int z) {
        return x * 20 + y * 50 + z * 100;
    }

    public static String triangleType(int x, int y, int z) {
        String answer = null;

        if (x > y + z || y > x + z || z > x + y) {
            answer = "not a triangle";
        } else {
            if (x == y && y == z) {
                answer = "isosceles";
            } else if (x == y || x == z || y == z) {
                answer = "equilateral";
            } else {
                answer = "different-sided";
            }
        }

        return answer;
    }

    public static int ternaryEvalution(int x, int y) {
        return (x > y) ? x : y;
    }

    public static int howManyItems(double k, double w, double h) {
        int i = 0;
        double n = k / 2;

        while (n > 0) {
            n = n - w * h;
            i++;
        }

        return i - 1;
    }

    public static int factorial(int x) {
        int answer = 1;

        while (x > 0) {
            answer *= x;
            --x;
        }

        return answer;
    }

    public static int gcd(int x, int y) {
        int end = 0;

        if (x > y) {
            end = x;
        } else {
            end = y;
        }

        int answer = 0;

        for (int i = end; i >= 0; i--) {
            if (x % i == 0 && y % i == 0 ) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static int ticketSaler(int x, int y) {
        int noComission = x * y;

        int itog = (int) (noComission - x * y * 0.28);

        return itog;
    }

    public static int tables(int x, int y) {
        while (y - 1 > 0) {
            if (x > 0) {
                x = x - 2;
            }
            --y;
        }

        int number_of_needed = x / 2;

        return number_of_needed;
    }
}
