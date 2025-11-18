package exceptions;

public class TerminoVacio extends Exception {
	  private static final long serialVersionUID = 1L;

	  public TerminoVacio() {
	        super("Error:El término no puede estar vacío.");
	    }

}