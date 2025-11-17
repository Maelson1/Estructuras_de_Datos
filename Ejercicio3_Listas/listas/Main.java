package listas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Diccionario dicc = new Diccionario();

        int opcion;

        do {
            System.out.println("MENÚ DICCIONARIO");
            System.out.println("1. Añadir término");
            System.out.println("2. Eliminar término");
            System.out.println("3. Buscar definición");
            System.out.println("4. Número de términos");
            System.out.println("5. Mostrar diccionario");
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
                        dicc.add(new Entrada(term, def));
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
                        break;

                    case 4:
                        System.out.println("Número de términos: " + dicc.size());
                        break;

                    case 5:
                        System.out.println(dicc);
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
