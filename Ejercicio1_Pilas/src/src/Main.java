package Ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce un número en base decimal: ");
	    int numero = sc.nextInt();

	    System.out.print("Introduce la base a la que deseas convertir (menor que 10): ");
	    int base = sc.nextInt();

	    System.out.print("¿Deseas usar pila estática (1) o dinámica (2)? ");
	    int tipo = sc.nextInt();

	    Stack<Integer> pila = null;

	    switch (tipo) {

	        case 1:
	            pila = new StackEstatica<>(100);   
	            break;

	        case 2:
	            pila = new StackDinamica<>();      
	            break;

	        default:
	            System.out.println("Opción no válida. Usando pila dinámica por defecto.");
	            pila = new StackDinamica<>();
	            break;
	    }

	    String resultado = CambioDeBase.convertirBase(numero, base, pila);

        System.out.println("Número convertido a base " + base + ": " + resultado);

        sc.close();
    }


}
