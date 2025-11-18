package exceptions;

public class TerminoNoEncontrado extends Exception {
    private static final long serialVersionUID = 1L;

	public TerminoNoEncontrado() {
        super("El término no está en el diccionario.");
    }
}