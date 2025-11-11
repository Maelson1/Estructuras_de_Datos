package main;
import excepciones.EmptyQueueException;
public class QueueDinamica<T> implements Queue<T> {
	
	private Node<T> frente;
	private Node<T> fin;
	private int size;
	
	public QueueDinamica() {
		frente = null;
		fin = null;
		size = 0;
	
	}
	public int size() {
		return size;
	}
	@Override
	public T dequeue() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		} 
		
		T dato = frente.getElemento();
		frente = frente.getNext();
		return dato;
		
	}
	@Override
	public boolean isEmpty() {
		return frente == null;
	}
	
	@Override
	public void enqueue(T dato) {
		Node<T> aux = new Node<>(dato, null);
		fin = aux;
		size++;
	}
	
	@Override
	public T front() {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		
		return frente.getElemento();
	}
}
