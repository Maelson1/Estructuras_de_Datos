package excepcionesPila;

public class EmptyStackException extends RuntimeException {
 public EmptyStackException() {
	 super("Error: La pila esta vacia");
 }
}
