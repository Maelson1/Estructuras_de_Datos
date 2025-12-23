package Proyecto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import graphsDSESIUCLM.Edge;
import graphsDSESIUCLM.Graph;
import graphsDSESIUCLM.Vertex;

public class AnalizarGrafo {

	public static void analizarGrafo(
		    Graph<DecoratedElement<String>, Interaction<Integer>> g) {

		    int numPersonajes = 0;
		    int numRelaciones = 0;

		    Map<Vertex<DecoratedElement<String>>, Integer> grados = new HashMap<>();

		  
		    Iterator<Vertex<DecoratedElement<String>>> itV = g.getVertices();

		    while (itV.hasNext()) {

		        Vertex<DecoratedElement<String>> v = itV.next();
		        numPersonajes++;

		        int grado = 0;
		        Iterator<Edge<Interaction<Integer>>> itE = g.incidentEdges(v);

		        while (itE.hasNext()) {
		            itE.next();
		            grado++;
		        }

		        grados.put(v, grado);
		    }

		  
		    Iterator<Edge<Interaction<Integer>>> itEdges = g.getEdges();
		    while (itEdges.hasNext()) {
		        itEdges.next();
		        numRelaciones++;
		    }

		    int max = Integer.MIN_VALUE;
		    int min = Integer.MAX_VALUE;

		    for (int gdo : grados.values()) {
		        if (gdo > max) max = gdo;
		        if (gdo < min) min = gdo;
		    }

		   
		    System.out.println("Numero de personajes: " + numPersonajes);
		    System.out.println("Numero total de relaciones: " + numRelaciones);

		    System.out.println("\nPersonaje(s) más implicado(s) (grado " + max + "):");
		    for (Vertex<DecoratedElement<String>> v : grados.keySet()) {
		        if (grados.get(v) == max) {
		            System.out.println(" - " + v.getElement().getValor());
		        }
		    }

		    System.out.println("\nPersonaje(s) más discreto(s) (grado " + min + "):");
		    for (Vertex<DecoratedElement<String>> v : grados.keySet()) {
		        if (grados.get(v) == min) {
		            System.out.println(" - " + v.getElement().getValor());
		        }
		    }
		}

}
