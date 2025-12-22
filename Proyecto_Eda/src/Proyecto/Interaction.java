package Proyecto;

import graphsDSESIUCLM.Element;

public class Interaction <E> implements Element {

	private Integer nLinea;
	private E peso;
	
	public Interaction(int n, E p) {
		this.nLinea=n;
		this.peso=p;
	}
	
	public String getID() {
		return nLinea.toString();
	}
	
	public E getElement() {
		return peso;
	}
}
