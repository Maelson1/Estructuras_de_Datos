package pilasPackage;
/**
 * Creamos una excepción para verificar si la pila está vacía
 */
public class EmptyStackException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	/**
	 * El mensaje de excepción se mostrará si la pila está vacía
	 */
	public EmptyStackException() {
		super ("Error: The Stack is Empty!");
	}
	
	public EmptyStackException(String message) {
		super(message);
	}

}
