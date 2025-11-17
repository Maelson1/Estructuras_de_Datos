package main;

public class Accion {

	public int numeroAcciones;
	public double precioCompra;
	
	public Accion (int nAcciones, double pCompra) {
		this.numeroAcciones=nAcciones;
		this.precioCompra=pCompra;
	}
	
	public int getAcciones() {
		return numeroAcciones;
	}
	
	public double getCompra() {
		return precioCompra;
	}
	
	public void setAcciones(int numeroAcciones) {
		this.numeroAcciones=numeroAcciones;
	}
	
	public void setCompra( double precioCompra) {
		this.precioCompra=precioCompra;
	}
}
