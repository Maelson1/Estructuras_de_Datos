package exceptions;

public class TerminoDuplicado extends Exception {
    public TerminoDuplicado() {
        super("Error:El término ya existe.");
    }
}