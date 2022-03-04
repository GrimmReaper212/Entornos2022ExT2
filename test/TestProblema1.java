import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {


    @Test
    public void Problema1ConcatenarNumeros() {
        String cadena = "1";
        String multiplo3;
        String multiplo5;
        String multiplode3y5;

        for (int i = 2; i <= 20; i++) {
            if (!esMultiploDe3(i) && !esMultiploDe5(i) && !esMultiploDe3Y5(i)){
                cadena = cadena + i;
            }

            if (esMultiploDe3(i)){
                multiplo3 = "Fizz";
                cadena = cadena + multiplo3;
            }

            if (esMultiploDe5(i)){
                multiplo5 = "Buzz";
                cadena = cadena + multiplo5;
            }

            if (esMultiploDe3Y5(i)){
                multiplode3y5 = "FizzBuzz";
                cadena = cadena + multiplode3y5;
            }
        }
        System.out.println(cadena);
        Assertions.assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzFizzBuzz1617Fizz19Buzz", cadena);
    }

    static boolean esMultiploDe3(Integer n){
        return n % 3 ==0;
    }

    static boolean esMultiploDe5(Integer n){
        return n % 5 ==0;
    }

    static boolean esMultiploDe3Y5(Integer n){
        return n % 5 ==0 && n % 3 ==0;
    }
}

