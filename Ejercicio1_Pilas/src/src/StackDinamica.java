package src;
import excepcionesPila.EmptyStackException;

public class StackDinamica<T> {
	
	private Node<T> top;
	private int size;
	
	public StackDinamica() {
		top = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		T elemento = top.getElemento();
		top = top.getNext();
		size--;
		return elemento;
	}
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(T elemento) {
		Node <T> aux = new Node<>(elemento, top);
		top=aux;
		size++;
	}
	
	public T top() {
		if(isEmpty()) {
			throw new EmptyStackException();
			}
		return top.getElemento();
	}
	
}
