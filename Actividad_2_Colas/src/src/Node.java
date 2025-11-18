package src;
/**
 * Crearemos la clase Node que funcionará como nodo para la cola dinámica
 * @param <T> es un parámetro genérico que funcionará junto al nodo
 */
public class Node<T> {
	private T elemento;
	private Node<T> next;
	/**
	 * Creamos el constructor del nodo junto a sus parámetros definidos previamente
	 * @param elem se utilizará para manejar el nodo
	 * @param n se utilizará para manejar el nodo
	 */
	public Node(T elem, Node<T> n) {
	
		this.elemento=elem;
		this.next=n;
	}
	/**
	 * Establecemos getter para Elemento
	 * @return devolverá el elemento
	 */
	public T getElemento() {
		return elemento;
	}
	/**
	 * Establecemos getter para el verificar el siguiente elemento
	 * @return devolverá el parámetro next
	 */
	public Node<T> getNext() {
		return next;
	}
	/**
	 * Creamos un setter para Elemento, si en algún caso se requiere asignar un elemento para el parámetro siguiente
	 * @param ele
	 */
	public void setElemento(T ele) {
		this.elemento=ele;
	}
	/**
	 * Creamos un setter para inicializar o escribir el siguiente elemento n que es del tipo asignado (genérico) del nodo
	 * @param n
	 */
	public void setNext(Node<T> n) {
		this.next=n;
	}
}