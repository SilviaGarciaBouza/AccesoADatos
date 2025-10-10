package teoria.ej207_test_unitarios;

import static java.lang.Float.NaN;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(3, 5);
        assertEquals(8, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        int resultado= calc.restar(3,5);
        assertEquals(-2, resultado);

    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado= calc.multiplicar(3,5);
        assertEquals(15, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        int resultado= calc.dividir(30,3);
        assertEquals(10, resultado);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        int resultado= calc.dividir(3,0);
    }
}
