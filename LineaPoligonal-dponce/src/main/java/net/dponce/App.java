package net.dponce;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
    	LineaPoligonal linea = new LineaPoligonal();
        String[] puntos=args[0].split(";");
        for (int i = 0; i<puntos.length;i++) {
        	String [] puntos2= puntos[i].split(",");
        	int puntoX=Integer.parseInt(puntos2[0]);
        	int puntoY=Integer.parseInt(puntos2[1]);
        	Punto p = new Punto(puntoX,puntoY);
        	linea.addPunto(p);
        }
        linea.debug();
    }
}
