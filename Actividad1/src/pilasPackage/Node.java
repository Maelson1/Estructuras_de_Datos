package pilasPackage;
/**
 * Creamos una clase para definir un nodo genérico que se usará posteriormente en la pila dinámica
 * @param <T>
 */
public class Node <T>{
	private T element;
	private Node<T> next;
	/**
	 * Creamos el nodo y definimos los siguientes parámetros
	 * @param elem
	 * @param n
	 */
	public Node(T elem, Node<T> n) {
		this.element = elem;
		this.next = n;
	}
	/**
	 * Creamos los getters y setters
	 * @return funcionará dependiendo del método y parámetro
	 */
	public T getElement() {
		return element;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public void setElement(T ele) {
		element = ele;
	}
	public void setNext(Node<T> n) {
		next = n;
	}
}
