package exceptions;

/**
 * Esta excepccion es usada para cuando el usuario introduce
 * un término que no esta en el diccionario
 * 
 */

public class TerminoNoEncontrado extends Exception {
    public TerminoNoEncontrado() {
        super("El término no está en el diccionario.");
    }
}
