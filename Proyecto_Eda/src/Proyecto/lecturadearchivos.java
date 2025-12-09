package Proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class lecturadearchivos {
	
	

	public static void leerArchivoVertices() {
	File archivo = new File("src/starwars-full-interactions-allCharacters_vertices.csv");

    try (Scanner sc = new Scanner(archivo)) {

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();

            StringTokenizer tokenizer = new StringTokenizer(linea, ",");

            String personaje1 = tokenizer.nextToken().trim();
            String valor = tokenizer.nextToken().trim();
            String color = tokenizer.nextToken().trim();

            System.out.println(personaje1 + " - " + valor + " - " + color);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado");
    }
}

public static void leerArchivoAristas() {
	File archivo2 = new File("src/starwars-full-interactions-allCharacters_aristas.csv");

    try (Scanner sc = new Scanner(archivo2)) {

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();

            StringTokenizer tokenizer = new StringTokenizer(linea, ",");

            String personaje1 = tokenizer.nextToken().trim();
            String personaje2 = tokenizer.nextToken().trim();
            int numescenas = Integer.parseInt(tokenizer.nextToken().trim());

            System.out.println(personaje1 + " - " + personaje2 + " - " + numescenas);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado");
    
}
	
	
}
}