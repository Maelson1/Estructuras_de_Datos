package Proyecto;
import graphsDSESIUCLM.Element;
public class DecoratedElement<E> implements Element {

	private Integer nVertices;
	private E valor;
	
	public DecoratedElement(int n, E va) {
		this.nVertices=n;
		this.valor=va;
	}
	@Override
	public String getID() {
		return nVertices.toString();
	}
	
	public E getValor() {
		return valor;
	}
	
}
