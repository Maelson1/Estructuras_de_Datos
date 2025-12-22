package Proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import graphsDSESIUCLM.Graph;

public class lecturadearchivos {
	
	

	public static void leerArchivoVertices( Graph<DecoratedElement<String>, Interaction<Integer>> g,
	        Map<String, DecoratedElement<String>> vertices) {
	File archivo = new File("src/starwars-full-interactions-allCharacters_vertices.csv");

    try (Scanner sc = new Scanner(archivo)) {

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();

            StringTokenizer tokenizer = new StringTokenizer(linea, ",");

            String personaje = tokenizer.nextToken().trim();
            String valor = tokenizer.nextToken().trim();
            String color = tokenizer.nextToken().trim();
            
            if (!vertices.containsKey(personaje)) {
                DecoratedElement<String> v =
                        new DecoratedElement<>(vertices.size(), personaje);
                vertices.put(personaje, v);
                g.insertVertex(v);
            }

            System.out.println(personaje + " - " + valor + " - " + color);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado");
    }
}

public static void leerArchivoAristas(Graph<DecoratedElement<String>, Interaction<Integer>> g,
        Map<String, DecoratedElement<String>> vertices) {
	File archivo2 = new File("src/starwars-full-interactions-allCharacters_aristas.csv");

    try (Scanner sc = new Scanner(archivo2)) {
    	
    	int n =0 ;

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();

            StringTokenizer tokenizer = new StringTokenizer(linea, ",");

            String personaje1 = tokenizer.nextToken().trim();
            String personaje2 = tokenizer.nextToken().trim();
            int numescenas = Integer.parseInt(tokenizer.nextToken().trim());
            
            DecoratedElement<String> p1 = vertices.get(personaje1);
            DecoratedElement<String> p2 = vertices.get(personaje2);

            if (p1 != null && p2 != null) {
                Interaction<Integer> e =
                        new Interaction<>(n, numescenas);
                g.insertEdge(p1, p2, e);
            }
        
            
            

            System.out.println(personaje1 + " - " + personaje2 + " - " + numescenas);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado");
    
}
	
	
}
}
