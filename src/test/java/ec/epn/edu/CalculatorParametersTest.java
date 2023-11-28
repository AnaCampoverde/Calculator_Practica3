package ec.epn.edu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private double num1;
    private double num2;
    private double resultado;

    public CalculatorParametersTest(double num1, double num2, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.0, 2.0, 4.0},
                {4.0, 2.0, 6.0},
                {15.0, 3.0, 18.0},
                {23.0, 2.0, 25.0},
        });
    }

    @Test
    public void testCalculadora() {
        assertEquals(resultado, Calculator.sumar(num1, num2), 0.001);
    }

}