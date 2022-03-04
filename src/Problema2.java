public class Problema2 {

    static boolean esMultiploDe3(Integer n) {
        return n % 3 == 0;
    }

    static boolean esMultiploDe5(Integer n) {
        return n % 5 == 0;
    }

    static boolean esMultiploDe3Y5(Integer n) {
        return n % 5 == 0 && n % 3 == 0;
    }

    static String concatenarNumerosYPalabras(int num1, int num2) {
        String cadena = "" + num1;
        String multiplo3;
        String multiplo5;
        String multiplode3y5;

        for (int i = num1+1; i <= num2; i++) {
            if (!esMultiploDe3(i) && !esMultiploDe5(i) && !esMultiploDe3Y5(i)) {
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
        }
        return cadena;
    }
}
