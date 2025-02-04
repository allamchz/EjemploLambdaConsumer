package ejemplolambdas;

/**
 * Programa principal, que define una lista de personas que será consumida o procesada de distintas formas
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main
{
    static void procesar(List<Persona> personas, Consumer<Persona> c)
    {
        for(Persona p: personas)
        {
            c.accept(p);
        }
    }

    public static void main(String[] args)
    {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Nacho", 42));
        listaPersonas.add(new Persona("Juan", 70));
        listaPersonas.add(new Persona("Mario", 7));
        listaPersonas.add(new Persona("Laura", 4));
        listaPersonas.add(new Persona("May", 41));

        Consumer<Persona> imprimir = p-> System.out.println(p);
        procesar(listaPersonas, imprimir);
    }
}
