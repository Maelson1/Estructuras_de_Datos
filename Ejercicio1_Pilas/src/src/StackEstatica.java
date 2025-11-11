package src;		

import exceptions.FullArrayException;

public abstract class StackEstatica<T> implements Stack<T>   {


	 
	    private T[] stack;  
	    private int N;      
	    private int t;      

	   
	   
		public void ArrayStack(int capacity) {
	        N = capacity;
	        stack = (T[]) new Object[N]; 
	        t = -1; 
	    }

        public void push(T value) throws FullArrayException {
            if (t == N-1) {

                System.out.println("Error: la pila está llena.");
                return;
            }
            stack[++t] = value; 
        }


    public T pop() {
        if(isEmpty()) {
            System.out.println("Error: la pila está vacía");
            return null;
        }
        else {
        return stack[t--];
        }

    }

    public T top() {
        if (isEmpty()) {  
            System.out.println("Error: la pila está vacía");
            return null; 
        } else {
            return stack[t]; 
        }
    }


    public boolean isEmpty() {
        return t < 0;

    }

    public int size() {
        return t + 1;

    }
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < N; i++) {
            sb.append(stack[i]);
            if (i < N - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }



}
