package Ejercicio1;

public class Node<T> {

	private T elemento;
	private Node<T> next;

	public Node(T elem, Node<T> n) {

		this.elemento=elem;
		this.next=n;
	}

	public T getElemento() {
		return elemento;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setElemento(T ele) {
		this.elemento=ele;
	}

	public void setNext(Node<T> n) {
		this.next=n;
	}

}
