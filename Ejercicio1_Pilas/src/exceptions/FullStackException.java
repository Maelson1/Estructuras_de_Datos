package exceptions;

public class FullArrayException extends RuntimeException {
	 public FullArrayException() {
		 super("Error: La pila esta llena");
	 }
}
