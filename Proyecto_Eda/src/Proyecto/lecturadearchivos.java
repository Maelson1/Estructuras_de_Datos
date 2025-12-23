package Proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import graphsDSESIUCLM.Graph;

public class lecturadearchivos {

    public static void createGraphFromFiles(
            Graph<DecoratedElement<String>, Interaction<Integer>> g) {

        Map<String, DecoratedElement<String>> vertices = new HashMap<>();

        try (Scanner sc = new Scanner(
                new File("src/starwars-full-interactions-allCharacters_vertices.csv"))) {

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
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo de vértices no encontrado");
        }

        
        try (Scanner sc = new Scanner(
                new File("src/starwars-full-interactions-allCharacters_aristas.csv"))) {

            int n = 0;

            while (sc.hasNextLine()) {

                n++;
                String linea = sc.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(linea, ",");

                String personaje1 = tokenizer.nextToken().trim();
                String personaje2 = tokenizer.nextToken().trim();
                int numescenas = Integer.parseInt(tokenizer.nextToken().trim());

                DecoratedElement<String> v1 = vertices.get(personaje1);
                DecoratedElement<String> v2 = vertices.get(personaje2);

                if (v1 != null && v2 != null) {
                    Interaction<Integer> e =
                            new Interaction<>(n, numescenas);
                    g.insertEdge(v1, v2, e);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo de aristas no encontrado");
        }
    }
}
