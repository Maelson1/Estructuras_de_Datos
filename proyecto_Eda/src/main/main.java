package main;

import java.util.*;

import graphsDSESIUCLM.Graph;
import graphsDSESIUCLM.TreeMapGraph;
import graphsDSESIUCLM.Vertex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Graph<DecoratedElement<String>, Interaction<Integer>> g = new TreeMapGraph< DecoratedElement<String>, Interaction<Integer>>();
		
		Map<String, DecoratedElement<String>> vertices = new HashMap<>();

    	lecturadearchivos.leerArchivoVertices(g, vertices);
    	lecturadearchivos.leerArchivoAristas(g, vertices);

    	System.out.println("Grafo creado");
    	System.out.println("Comprobando grafo...");

    	Iterator<Vertex<DecoratedElement<String>>> it = g.getVertices();

    	if (it.hasNext()) {
    	    System.out.println(" El grafo se ha creado correctamente");
    	} else {
    	    System.out.println("El grafo está vacío");
    	}
    	
    	public static List<Vertex<DecoratedElement<String>>> caminoMasCorto(
    	        Graph<DecoratedElement<String>, Interaction<Integer>> g,
    	        Vertex<DecoratedElement<String>> origen,
    	        Vertex<DecoratedElement<String>> destino) {

    	    Queue<Vertex<DecoratedElement<String>>> cola = new LinkedList<>();
    	    Map<Vertex<DecoratedElement<String>>, Vertex<DecoratedElement<String>>> padre = new HashMap<>();

    	    cola.add(origen);
    	    padre.put(origen, null);

    	    while (!cola.isEmpty()) {
    	        Vertex<DecoratedElement<String>> actual = cola.poll();

    	        if (actual.equals(destino)) {
    	            break;
    	        }

    	        Iterator<Vertex<DecoratedElement<String>>> it = g.getNeighborhood(actual);
    	        while (it.hasNext()) {
    	            Vertex<DecoratedElement<String>> vecino = it.next();
    	            if (!padre.containsKey(vecino)) {
    	                padre.put(vecino, actual);
    	                cola.add(vecino);
    	            }
    	        }
    	    }

    	    // Reconstruir camino
    	    List<Vertex<DecoratedElement<String>>> camino = new ArrayList<>();
    	    Vertex<DecoratedElement<String>> v = destino;

    	    while (v != null) {
    	        camino.add(v);
    	        v = padre.get(v);
    	    }

    	    Collections.reverse(camino);
    	    return camino;
    	}

    
    	Scanner sc = new Scanner(System.in);

    	System.out.print("Introduce personaje origen: ");
    	String nombreOrigen = sc.nextLine();

    	System.out.print("Introduce personaje destino: ");
    	String nombreDestino = sc.nextLine();

    	Vertex<DecoratedElement<String>> origen = null;
    	Vertex<DecoratedElement<String>> destino = null;

    	Iterator<Vertex<DecoratedElement<String>>> it = g.getVertices();
    	while (it.hasNext()) {
    	    Vertex<DecoratedElement<String>> v = it.next();
    	    String nombre = v.getElement().getElement();

    	    if (nombre.equals(nombreOrigen)) {
    	        origen = v;
    	    }
    	    if (nombre.equals(nombreDestino)) {
    	        destino = v;
    	    }
    	}

    	if (origen == null || destino == null) {
    	    System.out.println("Alguno de los personajes no existe");
    	} else {
    	    List<Vertex<DecoratedElement<String>>> camino =
    	            caminoMasCorto(g, origen, destino);

    	    System.out.println("Secuencia más corta:");
    	    for (Vertex<DecoratedElement<String>> v : camino) {
    	        System.out.print(v.getElement().getElement() + " ");
    	    }
    	}

	}

}

