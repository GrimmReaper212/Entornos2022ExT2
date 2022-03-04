public class Problema3 {

    static boolean esMultiploDe3(Integer n) {
        return n % 3 == 0;
    }

    static boolean esMultiploDe5(Integer n) {
        return n % 5 == 0;
    }

    static boolean esMultiploDe3Y5(Integer n) {
        return n % 5 == 0 && n % 3 == 0;
    }

    static boolean esMultiploDe7(Integer n) {
        return n % 7 == 0;
    }

    static boolean esMultiploDe11(Integer n) {
        return n % 11 == 0;
    }

    static boolean esMultiploDe3Y7(Integer n) {
        return n % 3 == 0 && n % 7 == 0;
    }

    static boolean esMultiploDe3Y11(Integer n) {
        return n % 3 == 0 && n % 11 == 0;
    }

    static boolean esMultiploDe5Y7(Integer n) {
        return n % 5 == 0 && n % 7 == 0;
    }

    static boolean esMultiploDe5Y11(Integer n) {
        return n % 5 == 0 && n % 11 == 0;
    }


    static String concatenarNumerosYPalabras(int num1, int num2) {
        String cadena = "" + num1;
        String multiplo3;
        String multiplo5;
        String multiplode3y5;
        String multiplode7;
        String multiplode11;
        String multiplode3y7;
        String multiplode3y11;
        String multiplode5y7;
        String multiplode5y11;

        for (int i = num1 + 1; i <= num2; i++) {
            if (!esMultiploDe3(i) && !esMultiploDe5(i) && !esMultiploDe3Y5(i) & !esMultiploDe7(i) && !esMultiploDe11(i) & !esMultiploDe3Y7(i) & !esMultiploDe3Y11(i) & !esMultiploDe5Y7(i) & !esMultiploDe5Y11(i)) {
                cadena = cadena + i;
            }

            if (esMultiploDe3(i)) {
                multiplo3 = "Fizz";
                cadena = cadena + multiplo3;
            }

            if (esMultiploDe5(i)) {
                multiplo5 = "Buzz";
                cadena = cadena + multiplo5;
            }

            if (esMultiploDe3Y5(i)) {
                multiplode3y5 = "FizzBuzz";
                cadena = cadena + multiplode3y5;
            }

            if (esMultiploDe7(i)) {
                multiplode7 = "Foo";
                cadena = cadena + multiplode7;
            }

            if (esMultiploDe11(i)){
                multiplode11 = "Boo";
                cadena = cadena + multiplode11;
            }

            if (esMultiploDe3Y7(i)){
                multiplode3y7 = "FizzFoo";
                cadena = cadena + multiplode3y7;
            }

            if (esMultiploDe3Y11(i)){
                multiplode3y11 = "FizzBoo";
                cadena = cadena + multiplode3y11;
            }

            if (esMultiploDe5Y7(i)){
                multiplode5y7 = "BuzzFoo";
                cadena = cadena + multiplode5y7;
            }

            if (esMultiploDe5Y11(i)){
                multiplode5y11 = "BuzzBoo";
                cadena = cadena + multiplode5y11;
            }
        }
        return cadena;
    }
}
