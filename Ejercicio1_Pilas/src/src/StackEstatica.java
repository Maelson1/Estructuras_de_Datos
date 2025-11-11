package Ejercicio1;

import exceptions.FullArrayException;

public class StackEstatica<T> implements Stack<T>   {



	    private T[] stack;
	    private int N;
	    private int t;



	    public StackEstatica(int capacity) {  
	        N = capacity;
	        stack = (T[]) new Object[N];
	        t = -1;
	    }

        @Override
		public void push(T value) throws FullArrayException {
            if (t == N-1) {

                System.out.println("Error: la pila está llena.");
                return;
            }
            stack[++t] = value;
        }


    @Override
	public T pop() {
        if(isEmpty()) {
            System.out.println("Error: la pila está vacía");
            return null;
        }
        else {
        return stack[t--];
        }

    }

    @Override
	public T top() {
        if (isEmpty()) {
            System.out.println("Error: la pila está vacía");
            return null;
        } else {
            return stack[t];
        }
    }


    @Override
	public boolean isEmpty() {
        return t < 0;

    }

    @Override
	public int size() {
        return t + 1;

    }
    @Override
	public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < N; i++) {
            sb.append(stack[i]);
            if (i < N - 1) {
				sb.append(", ");
			}
        }
        sb.append("]");
        return sb.toString();
    }



}
