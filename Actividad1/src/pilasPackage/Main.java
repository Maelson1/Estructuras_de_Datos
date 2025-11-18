package pilasPackage;
/**
 * Creamos la clase principal Main la cual importaremos un Scanner para interactuar con el usuario
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/**
		 * Definimos usuarios y outputs
		 */
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce un número en base decimal: ");
	    int numero = sc.nextInt();

	    System.out.print("Introduce la base a la que deseas convertir (menor que 10): ");
	    int base = sc.nextInt();

	    System.out.print("¿Deseas usar pila estática (1) o dinámica (2)? ");
	    int tipo = sc.nextInt();
	    /**
	     * Creamos la pila de enteros y le asignamos un valor nulo (no tiene valor dentro)
	     */
	    Stack<Integer> pila = null;
	    /**
	     * Hacemos un switch que funcionará en base al tipo de pila
	     * definiendo su utilidad en base a si el usuario selecciona si es estática o dinámica
	     */
	    switch (tipo) {

	        case 1:
	            pila = new StaticStack<>(100);   
	            break;

	        case 2:
	            pila = new DynamicStack<>();      
	            break;

	        default:
	            System.out.println("Opción no válida. Usando pila dinámica por defecto.");
	            pila = new DynamicStack<>();
	            break;
	    }
	    /**
	     * Llamamos al método convertirBase de la clase CambioDeBase para asignar al resultado y setamos parámetros
	     */
	    String resultado = CambioDeBase.convertirBase(numero, base, pila);

        System.out.println("Número convertido a base " + base + ": " + resultado);

        sc.close();
    }


}