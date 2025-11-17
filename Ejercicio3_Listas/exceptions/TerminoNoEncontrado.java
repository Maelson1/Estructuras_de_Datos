package exceptions;

public class TerminoNoEncontrado extends Exception {
    public TerminoNoEncontrado() {
        super("El término no está en el diccionario.");
    }
}