package net.dponce;

public class App 
{
    public static void main( String[] args )
    {
        // Creo Hangar
        Hangar unHangar = new Hangar();
        
        // Creo aeronaves y asigno combustible
        Helicoptero h1 = new Helicoptero("Chopper", 2, false); 
        Helicoptero h2 = new Helicoptero("Apache", 4, false); 
        AvionDePasajeros a1 = new AvionDePasajeros("747", 4, "Avianca"); 
        AvionDePasajeros a2 = new AvionDePasajeros("A300", 2, "IB Express");

        h1.setLitrosDeCombustible(100.5);
        h2.setLitrosDeCombustible(200.5);
        a1.setLitrosDeCombustible(300.5);
        a2.setLitrosDeCombustible(400.5);

        // Añado aeronaves al hangar
        unHangar.addAeronave(h1);
        unHangar.addAeronave(h2);
        unHangar.addAeronave(a1);
        unHangar.addAeronave(a2);
        
        
        // quito una 
        unHangar.removeAeronave(1);

        // obtengo la información del hangar
        unHangar.listarAeronaves();
        System.out.println("Combustible total en el hangar: " + unHangar.combustibleTotal() );
    }
}
