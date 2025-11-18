package src;
/**
 * En la clase Accion definiremos el uso de acciones del programa
 */
public class Accion {

	public int numeroAcciones;
	public double precioCompra;
	/**
	 * Creamos el constructor de la clase y definimos los parámetros
	 * @param nAcciones es el número de acciones
	 * @param pCompra es el precio de compra
	 */
	public Accion (int nAcciones, double pCompra) {
		this.numeroAcciones=nAcciones;
		this.precioCompra=pCompra;
	}
	/**
	 * Estblecemos un getter para Acciones
	 * @return devuelve el número de acciones
	 */
	public int getAcciones() {
		return numeroAcciones;
	}
	/**
	 * Establecemos el getter para Compra
	 * @return devuelve el precio de compra
	 */
	public double getCompra() {
		return precioCompra;
	}
	/**
	 * Establecemos un setter para Acciones
	 * @param numeroAcciones define el número de acciones establecido
	 */
	public void setAcciones(int numeroAcciones) {
		this.numeroAcciones=numeroAcciones;
	}
	/**
	 * Establecemos un settter para COmpra
	 * @param precioCompra define el precio de compra
	 */
	public void setCompra( double precioCompra) {
		this.precioCompra=precioCompra;
	}
}