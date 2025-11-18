/**
 * En este paquete manejaremos las excepciones del proyecto
 */
package excepciones;
/**
 * Creamos la excepción EmptyQueueException para verificar si la cola está vacía
 * es una extensión del paquete predefinido de java RuntimeException
 */
public class EmptyQueueException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	/**
	 * Cada vez que se invoque a la excepción imprimirá el mensaje
	 */
	public EmptyQueueException() {
		super("Error: La cola esta vacia");
	}
}