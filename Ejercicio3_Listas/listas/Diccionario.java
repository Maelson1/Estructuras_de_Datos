package listas;

import java.util.ArrayList;
import java.util.List;
import exceptions.TerminoDuplicado;
import exceptions.TerminoNoEncontrado;

public class Diccionario {

    private List<Entrada> entradas;
    private int nTerminos;

    public Diccionario() {
        entradas = new ArrayList<>();
        int nTerminos = 0 ;
    }

    public Entrada get(String termino) throws TerminoNoEncontrado {
        for (Entrada e : entradas) {
            if (e.getTermino().equalsIgnoreCase(termino)) {
                return e;
            }
        }
        throw new TerminoNoEncontrado();
    }

    public void add(Entrada entrada) throws TerminoDuplicado {
        if (exists(entrada.getTermino()))
            throw new TerminoDuplicado();

        entradas.add(entrada);
        nTerminos++;
    }

    public Entrada remove(String termino) throws TerminoNoEncontrado {
        for (Entrada e : entradas) {
            if (e.getTermino().equalsIgnoreCase(termino)) {
                entradas.remove(e);
                nTerminos--;
                return e;
            }
        }
        throw new TerminoNoEncontrado();
    }

    public int size() {
        return nTerminos;
    }

    public boolean exists(String termino) {
        for (Entrada e : entradas) {
            if (e.getTermino().equalsIgnoreCase(termino))
                return true;
        }
        return false;
    }

}
