package src;
/**
 * Creamos una cola genérica con parámetro genérico
 * @param <T>
 */
public interface Queue<T> {
	/**
	 * Establecemos que existe un método enqueue
	 * @param elemento es un parámetro del método enqueue que será definido después
	 */
	public void enqueue(T elemento);
	/**
	 * Establecemos la existencia del método dequeue
	 * @return quita el elemento de la cola y devuelve el elemento quitado
	 */
	public T dequeue();
	/**
	 * Establecemos la existencia del método front
	 * @return devolverá el próximo elemento a salir, es decir, el que está en la cima de la cola pero sin quitarlo de la cola
	 */
	public T front() ;
	/**
	 * Establecemos la existencia de un método isEmpty
	 * @return verificará si la cola está vacía
	 */
	public boolean isEmpty();
	/**
	 * Establecemos la existencia de un método size
	 * @return devolverá el tamaño de la cola
	 */
	public int size();
}