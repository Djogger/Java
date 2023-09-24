public class Primes {
    public static void main(String[] args) {
        for (int current_number = 100; current_number > 1; current_number--) {
           boolean our_number = IsPrime(current_number);

            if (our_number) System.out.println(current_number); // если 'true', то...
        }
    }

    public static boolean IsPrime(int number) {
        boolean bool = true;

        for (int number_delenie = number - 1; number_delenie > 1; number_delenie--) {
            if (number % number_delenie == 0) {
                bool = false;
                break;
            }
        }

        return bool;
    }
}

// Это был мой вариант решения, просто я невнимательный и сделал не так, как требовалось в задании :)
/*
* public static void IsPrime(int number) {
           for (int current_number = number; current_number > 1; current_number--) {
               boolean our_number = true;

               for (int number_delenie = current_number - 1; number_delenie > 1; number_delenie--) {
                   if (current_number % number_delenie == 0) {
                       our_number = false;
                       break;
                   }
               }

               if (our_number == true) {
                   System.out.println(current_number);
               }
        }
    }
    * */
