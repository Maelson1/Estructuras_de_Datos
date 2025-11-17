package listas;
import exceptions.TerminoVacio;

public class Entrada implements Comparable<Entrada> {

	    private String termino;
	    private String definicion;

	    public Entrada(String termino, String definicion) throws TerminoVacio {
	        if (termino == null || termino.isEmpty())
	            throw new TerminoVacio();
	        if (definicion == null)
	            definicion = "";

	        this.termino = termino;
	        this.definicion = definicion;
	    }

	    public String getTermino() {
	        return termino;
	    }

	    public String getDefinicion() {
	        return definicion;
	    }

	    public void setDefinicion(String definicion) {
	        this.definicion = definicion;
	    }

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

	    @Override
	    public int hashCode() {
	        return termino.hashCode(); 
	    }

	    @Override
	    public String toString() {
	        return termino + ": " + definicion;
	    }
	}


