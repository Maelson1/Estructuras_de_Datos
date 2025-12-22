package Proyecto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import graphsDSESIUCLM.Graph;
import graphsDSESIUCLM.TreeMapGraph;
import graphsDSESIUCLM.Vertex;
public class main {

    public static void main(String[] args) {

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


    }
    }
