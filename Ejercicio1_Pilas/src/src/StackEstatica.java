package src;


public abstract class StackEstatica implements Stack<Object> {


    public class ArrayStack {
        private int[] stack;  // el array que almacena los elementos
        private int N;        // tamaño máximo de la pila
        private int t;        // índice del tope (top)

        // Constructor
        public ArrayStack(Object element) {
            N = (int) element;
            stack = new int[N];
            t = -1;} // 

        public void push(int value) throws FullArrayException {
            if (t == N-1) {

                System.out.println("Error: la pila está llena.");
                return;
            }
            stack[++t] = value; 
        }


    public Object pop(Object element) {
        if(isEmpty());{
            System.out.println("Error: la pila está vacía");

        }
        return element
        ;

    }

    public Object top() {

        return null;
    }

    public boolean isEmpty() {
        return t < 0;

    }

    public int size() {
        return t + 1;

    }

}
public static void main(String[] args) {

    }
}
