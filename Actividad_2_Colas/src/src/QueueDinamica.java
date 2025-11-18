package src;
/**
 * Crearemos la clase QueueDinamica, la cual establecerá como va a funcionar la cola de tipo dinámico
 * importamos la excepción previamente creada @class:EmptyQueueException del paquete @package:excepciones
 * también imprementamos la clase @class:Queue junto al parámetro genérico T en ambas colas, la genérica y al dinámica
 */
import excepciones.EmptyQueueException;
public class QueueDinamica<T> implements Queue<T> {
		/**
		 * Establecemos los parámetros que se usarán dentro de la cola Dinámica
		 */
		private Node<T> frente;
		private Node<T> fin;
		private int size;
		/**
		 * Creamos el constructor de la Cola Dinámica
		 */
		public QueueDinamica() {
			frente = null;
			fin = null;
			size = 0;
		/**
		 * Sobreescribimos el método size para que pueda funcionar correctamente
		 */
		}
		@Override
		public int size() {
			return size;
		}
		/**
		 * Sobreescribimos isEmpty para que asigne el parámetro frente a nulo
		 */
		@Override
		public boolean isEmpty() {
			return frente == null;
		}
		/**
		 * Sobreescribimos enqueue para que pueda encolar elementos en la cola dinámica
		 * Este método necesitará como parámetro un dato de tipo T, genérico
		 */
		@Override
		public void enqueue(T dato) {
			Node<T> aux = new Node<>(dato, null);
			
			if(isEmpty()) {
				frente = aux;
			} else {
				fin.setNext(aux);
			}
			
			fin = aux;
			size++;
		}
		/**
		 * Sobreescribimos el método dequeue para que pueda desencolar elementos de la cola
		 * Lanzará una excepción si está vacía
		 * Si no está vacía quitará el elemento de la cola y lo devolverá
		 */
		@Override
		public T dequeue() {
			if(isEmpty()) {
				throw new EmptyQueueException();
			} 
			
			T dato = frente.getElemento();
			frente = frente.getNext();
			
			if(frente == null) {
				fin = null;
			}
			size--;
			return dato;
			
		}
		/**
		 * Sobreescribimos el método front, el cual funcionará como peek y devolverá el elemento próximo a salir de la cola o el que está en la cima
		 */
		@Override
		public T front() {
			if (isEmpty()) {
				throw new EmptyQueueException();
			}
			
			return frente.getElemento();
		}
	}