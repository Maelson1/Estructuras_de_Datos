package pilasPackage;
/**
 * Creamos una clase interfaz que la llamaremos Stack, esta posee un parámetro genérico
 * @param <T>
 */
public interface Stack<T>{
	/**
	 * Creamos los métodos con parámetros genéricos o sin parámetros para usarlos posteriormente fuera de la interfaz
	 * @param element
	 */
	public void push (T element);
	public T pop();
	public T top();
	public boolean isEmpty();
	public int size();
	public String toString();
}
