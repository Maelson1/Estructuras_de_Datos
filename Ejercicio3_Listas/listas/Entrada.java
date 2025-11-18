package listas;
import exceptions.TerminoVacio;

/**
 * Representa una entrada de diccionario formada por un término
 * y su definición asociada.
 *
 * Cada entrada puede compararse con otra mediante su término,
 * y dos entradas se consideran iguales si sus términos coinciden.
 * @author Pablo
 * @since 2025-11-18
 * @version 1.0
 */

public class Entrada implements Comparable<Entrada> {

	    private String termino;
	    private String definicion;
	    private int contador = 0;
	    /**
	     * Crea una nueva entrada de diccionario.
	     *
	     * @param termino     el término que se desea definir
	     * @param definicion  la definición del término
	     * @throws TerminoVacio si el término enviado que se desea definir es nulo o vacio
	     */

	    public Entrada(String termino, String definicion, int contador) throws TerminoVacio {
	        if (termino == null || termino.isEmpty())
	            throw new TerminoVacio();
	        if (definicion == null)
	            definicion = "";

	        this.termino = termino;
	        this.definicion = definicion;
	        this.contador= contador;
	    }
	    /**
	     * Devuelve el término que define esta entrada.
	     *
	     * @return el término de la entrada
	     */

	    public String getTermino() {
	        return termino;
	    }
	    /**
	     * Devuelve la definición correspondiente al término.
	     *
	     * @return la definición de la entrada
	     */

	    public String getDefinicion() {
	        return definicion;
	    }
	    
	    
	    public int getContador() {
	    	return contador;
	    }
	    
	    /**
	     * Establece una nueva definición para el término.
	     *
	     * @param definicion la nueva definición del término
	     */
	    
	    
	    public void setDefinicion(String definicion) {
	        this.definicion = definicion;
	    }
	    /**
	     * Compara esta entrada con otra teniendo en cuenta el término.
	     * El orden se basa en el orden alfabético del término.
	     *
	     * @param e la otra entrada a comparar
	     * @return un valor negativo, cero o positivo según el término de esta
	     *         entrada sea menor, igual o mayor que el de la otra
	     */

	   
	    @Override
	    public int compareTo(Entrada e) {
	        return this.termino.compareTo(e.termino);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Entrada)) return false;

	        Entrada e = (Entrada) obj;
	        return this.termino.equals(e.termino);
	    }
	    /**
	     * Devuelve el código hash de la entrada, basado en su término.
	     *
	     * @return el código hash del término
	     */

	    @Override
	    public int hashCode() {
	        return termino.hashCode(); 
	    }
	    /**
	     * Devuelve una representación textual de la entrada.
	     *
	     * @return una cadena con el formato "término: definición"
	     */

	    @Override
	    public String toString() {
	        return termino + ": " + definicion;
	    }
	}


