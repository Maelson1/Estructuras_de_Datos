package exceptions;

public class TerminoDuplicado extends Exception {
    private static final long serialVersionUID = 1L;

	public TerminoDuplicado() {
        super("Error:El término ya existe.");
    }
}