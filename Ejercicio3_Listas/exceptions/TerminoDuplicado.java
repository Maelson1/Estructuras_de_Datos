package exceptions;

/**
 * Esta excepción sirve para cuando el usuario introduce un termino duplicado
 * en el diccionario por lo tanto no es válido
 * 
 */
public class TerminoDuplicado extends Exception {
    public TerminoDuplicado() {
        super("Error:El término ya existe.");
    }
}
