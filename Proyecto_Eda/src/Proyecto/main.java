package Proyecto;

import java.util.Iterator;
import java.util.Scanner;

import graphsDSESIUCLM.Graph;
import graphsDSESIUCLM.TreeMapGraph;
import graphsDSESIUCLM.Vertex;

public class main {

    public static void main(String[] args) {

        Graph<DecoratedElement<String>, Interaction<Integer>> g =
                new TreeMapGraph<>();

        lecturadearchivos.createGraphFromFiles(g);

       
        Iterator<Vertex<DecoratedElement<String>>> it = g.getVertices();

        if (it.hasNext()) {
            System.out.println("El grafo se ha creado correctamente");
        } else {
            System.out.println("El grafo está vacío");
        }
        
        AnalizarGrafo.analizarGrafo(g);
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce personaje origen: ");
        String origen = sc.nextLine();

        System.out.print("Introduce personaje destino: ");
        String destino = sc.nextLine();

        caminomascorto.caminoMasCorto(g, origen, destino);


    }
}
