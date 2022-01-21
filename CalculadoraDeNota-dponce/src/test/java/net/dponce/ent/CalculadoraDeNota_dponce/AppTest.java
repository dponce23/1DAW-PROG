package net.dponce.ent.CalculadoraDeNota_dponce;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Comprueba que los parametros 5 5 5 5 1 1 dan 6(todo aprobado con actitud 1 y asis 1)
     */
    @Test
    public void comprobarEsSeis()
    {
       CalculadoraDeNota calcular=new CalculadoraDeNota();
       double nota=calcular.sacarMedia(5, 5, 5, 5, 1, 1);
       assertEquals(6, nota, 0.001);
    }
    
    @Test
    public void comprobarEsSeis2()
    {
       assertEquals(6, (new CalculadoraDeNota()).sacarMedia(5, 5, 5, 5, 1, 1), 0.001);
    }
    
    /**
     * Comprueba que los parametros 10 2 10 10 1 1 dan 0(todo aprobado con actitud 1 y asis 1)
     */
    @Test
    public void comprobarEsCero()
    {
       CalculadoraDeNota calcular=new CalculadoraDeNota();
       double nota=calcular.sacarMedia(10, 2, 10, 10, 1, 1);
       assertEquals(0, nota, 0.001);
    }
    /**
     * Comprueba que los parametros 11 10 10 10 1 1 dan 0 por datos incorrectos(todo aprobado con actitud 1 y asis 1)
     */
    @Test
    public void comprobarDatosIncorrectos()
    {
       CalculadoraDeNota calcular=new CalculadoraDeNota();
       double nota=calcular.sacarMedia(11, 10, 10, 10, 1, 1);
       assertEquals(0, nota, 0.001);
    }
    
    /**
     * Comprueba que los parametros 11 10 10 10 1 1 dan 0 por datos incorrectos(todo aprobado con actitud 1 y asis 1)
     */
    @Test
    public void comprobarMenciondeHonor()
    {
       CalculadoraDeNota calcular=new CalculadoraDeNota();
       String mensaje=calcular.nota2String(10);
       assertNotEquals(-1, mensaje.indexOf("MENCIÓN DE HONOR"));
    }
}
