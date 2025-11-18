package pilasPackage;

public class StaticStack <T> implements Stack <T> {
	/**
	 * Definimos los atributos de la pila estática
	 */
	private T[] stack;
	private int n;
	private int t;

	/**
	 * Constructor de la Stack Dinámica
	 * @param capacity es el parámetro para crear la pila dinámica
	 */
	public StaticStack(int capacity) {
		n = capacity;
		this.stack = (T[]) new Object[n];
		t = -1;
	}
	/**
	 * Sobreescribimos el método push de la clase interfaz Stack
	 * Se dará un uso diferente en cada tipo de pila
	 */
	@Override
	public void push(T element) throws FullArrayException {
		if (t == n-1) {
			throw new FullArrayException();
		}
		stack[++t] = element;
	}
	/**
	 * Sobreescribimos el método pop de la clase interfaz Stack
	 * verificamos si la pila está vacía, si lo está lanzamos la excepción de que está vacía
	 */
	@Override
	public T pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			return stack[t--];
		}
	}
	/**
	 * Sobreescribimos el método top de la clase interfaz Stack
	 * verificamos si la pila está vacía, si lo está lanzamos la excepción de que está vacía
	 */
	@Override
	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			return stack[t];
		}
	}
	/**
	 * Sobreescribimos si el método isEmpty para verificar exitosamente que existe al menos un elemento
	 */
	@Override
	public boolean isEmpty() {
		return t < 0;
	}
	/**
	 * Sobreescribimos el método size
	 */
	@Override
	public int size() {
		return t + 1;
	}

}