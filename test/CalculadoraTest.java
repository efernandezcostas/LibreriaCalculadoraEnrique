import LibreriaCalc.Calculadora;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    // Test suma
    @Test
    public void sumaPositivos(){
        assertEquals(5, Calculadora.calculadora(3,2,Calculadora.SUMA));
    }
    // Test suma negativos
    @Test
    public void sumaNegativos(){
        assertEquals(-5, Calculadora.calculadora(-3,-2,Calculadora.SUMA));
    }
    // Test resta
    @Test
    public void restaPositivos(){
        assertEquals(1, Calculadora.calculadora(3,2,Calculadora.RESTA));
    }
    // Test resta negativos
    @Test
    public void restaNegativos(){
        assertEquals(-1, Calculadora.calculadora(-3,-2,Calculadora.RESTA));
    }
}
