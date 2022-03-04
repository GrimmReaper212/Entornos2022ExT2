import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema2 {

    @Test
    public void concatenarCualquierRango (){
        int numero1 = 10;
        int numero2 = 20;

        Assertions.assertEquals("1011Fizz1314FizzBuzzFizzBuzz1617Fizz19Buzz", Problema2.concatenarNumerosYPalabras(numero1, numero2));
    }
}
