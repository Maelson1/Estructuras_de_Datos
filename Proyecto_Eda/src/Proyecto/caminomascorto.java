package Proyecto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import graphsDSESIUCLM.Edge;
import graphsDSESIUCLM.Graph;
import graphsDSESIUCLM.Vertex;

public class caminomascorto {
	
	public static void caminoMasCorto(
		    Graph<DecoratedElement<String>, Interaction<Integer>> g,
		    String origen,
		    String destino) {

		    Vertex<DecoratedElement<String>> vOrigen = null;
		    Vertex<DecoratedElement<String>> vDestino = null;

		    Iterator<Vertex<DecoratedElement<String>>> it = g.getVertices();
		    while (it.hasNext()) {
		        Vertex<DecoratedElement<String>> v = it.next();
		        String nombre = v.getElement().getValor();

		        if (nombre.equalsIgnoreCase(origen)) {
		            vOrigen = v;
		        }
		        if (nombre.equalsIgnoreCase(destino)) {
		            vDestino = v;
		        }
		    }

		    if (vOrigen == null || vDestino == null) {
		        System.out.println("Alguno de los personajes no existe.");
		        return;
		    }

		
		    Map<Vertex<DecoratedElement<String>>, Vertex<DecoratedElement<String>>> padre =
		            new HashMap<>();

		    Queue<Vertex<DecoratedElement<String>>> cola = new LinkedList<>();
		    Set<Vertex<DecoratedElement<String>>> visitados = new HashSet<>();

		    cola.add(vOrigen);
		    visitados.add(vOrigen);
		    padre.put(vOrigen, null);

		    boolean encontrado = false;

		    while (!cola.isEmpty() && !encontrado) {

		        Vertex<DecoratedElement<String>> actual = cola.poll();

		        Iterator<Edge<Interaction<Integer>>> itE = g.incidentEdges(actual);
		        while (itE.hasNext()) {

		            Edge<Interaction<Integer>> e = itE.next();
		            Vertex<DecoratedElement<String>> vecino =
		                    g.opposite(actual, e);

		            if (!visitados.contains(vecino)) {
		                visitados.add(vecino);
		                padre.put(vecino, actual);
		                cola.add(vecino);

		                if (vecino.equals(vDestino)) {
		                    encontrado = true;
		                    break;
		                }
		            }
		        }
		    }

		   
		    if (!padre.containsKey(vDestino)) {
		        System.out.println("No existe camino entre los personajes.");
		        return;
		    }

		    List<String> camino = new ArrayList<>();
		    Vertex<DecoratedElement<String>> paso = vDestino;

		    while (paso != null) {
		        camino.add(paso.getElement().getValor());
		        paso = padre.get(paso);
		    }

		    Collections.reverse(camino);

		   
		    System.out.println("\nCamino más corto entre " + origen + " y " + destino + ":");
		    for (int i = 0; i < camino.size(); i++) {
		        System.out.print(camino.get(i));
		        if (i < camino.size() - 1) {
		            System.out.print(" -> ");
		        }
		    }
		    System.out.println();
		}


}
