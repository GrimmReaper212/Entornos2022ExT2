import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestProblema3 {

    @Test
    public void concatenarNuevosMultiplos(){
        int numero1 = 1;
        int numero2 = 25;

        Assertions.assertEquals("12Fizz4BuzzFizzFoo8FizzBuzzBooFizz13FooFizzBuzzFizzBuzz1617Fizz19BuzzFizzFooFizzFooBoo23FizzBuzz", Problema3.concatenarNumerosYPalabras(numero1, numero2));
    }
}
