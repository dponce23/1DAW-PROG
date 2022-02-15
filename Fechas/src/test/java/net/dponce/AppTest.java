package net.dponce;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    @DisplayName("Test que prueba que el programa devuelva una fecha correcta")
    public void comprobarQueDevuelveUnaFechaCorrecta()
    {
        Fecha fecha1= new Fecha(23,3,2002);
        String prueba=fecha1.toString();
        assertEquals(prueba,23-03-2002);
    }
}
