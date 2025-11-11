package Ejercicio1;

import exceptions.EmptyStackException;

public class StackDinamica<T> implements Stack<T> {

	private Node<T> top;
	private int size;

	public StackDinamica() {
		top = null;
		size = 0;
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}

		T elemento = top.getElemento();
		top = top.getNext();
		size--;
		return elemento;
	}
	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(T elemento) {
		Node <T> aux = new Node<>(elemento, top);
		top=aux;
		size++;
	}

	@Override
	public T top() {
		if(isEmpty()) {
			throw new EmptyStackException();
			}
		return top.getElemento();
	}

}
