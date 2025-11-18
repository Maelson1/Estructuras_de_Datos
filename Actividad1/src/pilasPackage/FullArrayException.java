package pilasPackage;
/**
 * Creamos la excepción FullArrayException
 */
public class FullArrayException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	/**
	 * Esta imprimirá un mensaje si la pila está llena
	 */
	public FullArrayException() {
		super ("Error: The Stack is full!");
	}
	
	public FullArrayException(String message) {
		super(message);
	}

}
