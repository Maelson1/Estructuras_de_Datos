package pilasPackage;
/**
 * Creamos una clase para la pila Dinámica, esta implementará la interfaz y un parámetro genérico
 * @param <T>
 */
public class DynamicStack <T> implements Stack<T>{
	private Node <T> top;
	private int size;
	/**
	 * Creamos el constructor
	 */
	public DynamicStack() {
		this.top = null;
		this.size = 0;
	}
	/**
	 * Sobreescribimos el push para la pila dinámica
	 */
	@Override
	public void push(T element) {
		Node<T> aux = new Node<T>(element, top);
		top = aux;
		size++;
	}
	/**
	 * Sobreescribimos el pop para la dinámica.
	 * Verificará si la pila está vacía y si lo está imprimirá un mensaje y lanzará la excepción
	 */
	@Override
	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T element = top.getElement();
		top = top.getNext();
		size--;
		return element;
	}
	/**
	 * Sobreescribimos el método top
	 * Si la pila está vacía lanzará una excepción
	 */
	@Override
	public T top() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.getElement();
	}
	/**
	 * Sobreescribimos isEmpty y size
	 */
	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public int size() {
		return size;
	}
	

}