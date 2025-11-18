package src;
/**
 * Creamos la clase Menu para usarla como Main
 * Importaremos un Scanner para interactuar con el usuario
 */
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		/**
		 * Inicializamos el scanner
		 * Creamos la Cola Accion de tipo dinámica
		 * inicializamos un parámetro a 0 que se llama gananciaTotal
		 * declaramos un entero de nombre opción
		 */
		Scanner sc = new Scanner(System.in);
		QueueDinamica<Accion> cola = new QueueDinamica<>();
		double gananciaTotal = 0;
		int opcion;
		
		/**
		 * Mostramos por pantalla las opciones del usuario y creamos un switch
		 * en el caso 1 compra ganancias y las registra, el usuario define el número de acciones compradas y precio por acción, luego las encola y muestra por pantalla
		 * en el caso 2 El usuario vende acciones donde define el precio y número de acciones mientras estas existan, sino lanza una excepcion. También desencola las vendidas
		 * en el caso 3 se muestra la ganancia de capital actual
		 * en el caso 4 se sale del programa
		 */
		do {
			System.out.println("1. Comprar ganancias ");
			System.out.println("2. Vender Acciones");
			System.out.println("3. Ganancia de capital hasta el momento");
			System.out.println("4. Salir ");
		
			System.out.println("Que quieres hacer?");
			opcion=sc.nextInt();
			switch (opcion) {
			
			case 1:
				System.out.println("Numero de acciones compradas: ");
				int nCompradas = sc.nextInt();
				
				System.out.println("Precio por accion: ");
				double nValor = sc.nextDouble();
				
				cola.enqueue(new Accion(nCompradas, nValor));
				
				System.out.println("Los valores fueron registrados siendo: " + nCompradas + " y " + nValor );
				break;
			
			case 2:
				System.out.println("Numero de acciones a vender: ");
				int nVendidas= sc.nextInt();
				System.out.println("Precio de las acciones: ");
				double nPrecio= sc.nextDouble();
				
				while (nVendidas > 0 && !cola.isEmpty()) {
					Accion actual = cola.front();
					System.out.println("Acciones en cola: " + actual.getAcciones() + " a " + actual.getCompra());
					
					if(actual.getAcciones() <= nVendidas) {
						double ganancia = actual.getAcciones() * (nPrecio - actual.getCompra());
						gananciaTotal+= ganancia;
						nVendidas-= actual.getAcciones();
						cola.dequeue();
					}else {
						double ganancia = nVendidas * (nPrecio - actual.getCompra());
						gananciaTotal+= ganancia;
						
						actual.setAcciones(actual.getAcciones() - nVendidas);
						
						nVendidas = 0;
					}
				}
				System.out.println("La venta ha sido realizada. ");
				break;
				
			case 3:
				System.out.println("ganancia total: " + gananciaTotal + " $ " );
				break;
				
			case 4:
				System.out.println("Saliste del programa. Buen dia.");
				break;
			default:
				System.out.println("valor incorrecto");
			}
		
	} while (opcion != 4);
		sc.close();
	}
}
	