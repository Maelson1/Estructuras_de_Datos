package excepciones;

public class EmptyQueueException extends RuntimeException {

	public EmptyQueueException() {
		super("Error: La cola esta vacia");
	}
}
