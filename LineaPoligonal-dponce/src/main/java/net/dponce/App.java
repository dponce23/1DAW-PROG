package net.dponce;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        String[] puntos=args[0].split(";");
        for (int i = 0; i<puntos.length;i++) {
        	String [] puntos2= puntos[i].split(",");
        	System.out.println(Arrays.toString(puntos2));
        }
    }
}
