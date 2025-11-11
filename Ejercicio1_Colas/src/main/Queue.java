package main;

public interface Queue<T> {
	
	public void enqueue(T elemento);
	public T dequeue();
	public T front() ;
	public boolean isEmpty();
	public int size();
}
