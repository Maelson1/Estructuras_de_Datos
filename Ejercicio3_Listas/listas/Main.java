package listas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Diccionario dicc = new Diccionario();

        int opcion;
        int contadorGlobal = 0 ;

        do {
            System.out.println("MENÚ DICCIONARIO");
            System.out.println("1. Añadir término");
            System.out.println("2. Eliminar término");
            System.out.println("3. Buscar definición");
            System.out.println("4. Número de términos");
            System.out.println("5. Mostrar diccionario");
            System.out.println("6. Modificar definición");
            System.out.println("7. Ver frecuencia de cada término");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Término: ");
                        String term = sc.nextLine();
                        System.out.print("Definición: ");
                        String def = sc.nextLine();
                        int cont = 0;
                        dicc.add(new Entrada(term, def,cont));
                        System.out.println(" Termino añadido");
                        
                        break;

                    case 2:
                        System.out.print("Término a eliminar: ");
                        String tEliminar = sc.nextLine();
                        dicc.remove(tEliminar);
                        System.out.println(" Término eliminado ");
                        break;

                    case 3:
                        System.out.print("Término a buscar: ");
                        String tBuscar = sc.nextLine();
                        Entrada e = dicc.get(tBuscar);
                        System.out.println("Definición: " + e.getDefinicion());
                        int conta = 0;
                        conta=e.getContador()+1;
                     	dicc.add(new Entrada(tBuscar,e.getDefinicion(),conta));
                        contadorGlobal++;
                        break;

                    case 4:
                        System.out.println("Número de términos: " + dicc.size());
                        break;

                    case 5:
                        System.out.println(dicc);
                        break;
                       
                    case 6:
                    	System.out.println("Término a modificar: ");
                    	String tModificar = sc.nextLine();
                    	Entrada g = dicc.get(tModificar);
                    	System.out.println("Nueva definición: ");
                    	String nuevaDef = sc.nextLine();
                    	dicc.remove (tModificar);
                    	int conta2 =0;
                    	conta2= g.getContador()+1;
                     	dicc.add(new Entrada(tModificar, nuevaDef,conta2));
                    	contadorGlobal++;
                    	break;
                    	
                   
                    case 7:
                    	System.out.println("Término a buscar: ");
                    	String tBuscar2 = sc.nextLine();
                    	Entrada t = dicc.get(tBuscar2);
                    	System.out.println("Contador de usos de " + tBuscar2+ ":"+t.getContador());
                    	System.out.println("Frecuencia de usos de " +tBuscar2+ ": "+contadorGlobal/t.getContador());
                    	break;

                    case 0:
                        System.out.println("Saliendo");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (Exception ex) {
                System.out.println("Error:Saliendo del programa ");
            }

        } while (opcion != 0);

        sc.close();
    }
}
