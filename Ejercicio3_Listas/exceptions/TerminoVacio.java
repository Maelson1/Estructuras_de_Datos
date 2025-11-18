package exceptions;

/*
 * Esta excepccion es usada para cuando el usuario introduce un
 * término vacío
 * 
 */
public class TerminoVacio extends Exception {
	  public TerminoVacio() {
	        super("Error:El término no puede estar vacío.");
	    }

}
