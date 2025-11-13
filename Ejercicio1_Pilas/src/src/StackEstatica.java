package Ejercicio1;

import exceptions.EmptyStackException;
import exceptions.FullStackException;
import exceptions.FullStackException;

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
		public void push(T value) throws FullStackException {
            if (t == N-1) {

                throw new FullStackException();
                
            }
            stack[++t] = value;
        }


    @Override
	public T pop()throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
            
        }
        else {
        return stack[t--];
        }

    }

    @Override
	public T top() throws EmptyStackException{
        if (isEmpty()) {
           throw new EmptyStackException();
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
        String resultado = "[";

        for (int i = 0; i <= t; i++) {
            resultado = resultado + stack[i];
            if (i < t) {
                resultado = resultado + ", ";
            }
        }

        resultado = resultado + "]";
        return resultado;
    }




}
