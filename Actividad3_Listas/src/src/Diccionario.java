package src;
/**
 * Importamos List y ArrayList del paquete util de java para poder usar listas
 * Importamos las excepciones del paquete exceptions creado anteriormente
 */
import java.util.ArrayList;
import java.util.List;
import exceptions.TerminoDuplicado;
import exceptions.TerminoNoEncontrado;
/**
 * Creamos la clase Diccionario donde se va a generar los datos de entrada del usuario
 */
public class Diccionario {
	/**
	 * Definimos los parámetros que serán utilizados posteriormente en el código de la clase
	 */
    private List<Entrada> entradas;
    private int nTerminos;
    /**
     * Creamos el constructor de la clase y dentro un ArrayList de nombre entrada
     */
    public Diccionario() {
        entradas = new ArrayList<>();
        int nTerminos = 0;
    }
    /**
     * Creamos un getter para el término de tipo Entrada
     * @param termino 
     * @return
     * @throws TerminoNoEncontrado
     */
    public Entrada get(String termino) throws TerminoNoEncontrado {
        for (Entrada e : entradas) {
            if (e.getTermino().equalsIgnoreCase(termino)) {
                return e;
            }
        }
        throw new TerminoNoEncontrado();
    }
    /**
     * Creamos el método add que será para añadir elementos en la lista
     * si hay algún término duplicado lanzará una excepción
     * @param entrada es de tipo entrada, se usa para getTermino
     * @throws TerminoDuplicado lanza la excepción si hay un término duplicado
     */
    public void add(Entrada entrada) throws TerminoDuplicado {
        if (exists(entrada.getTermino()))
            throw new TerminoDuplicado();

        entradas.add(entrada);
        nTerminos++;
    }
    /**
     * Creamos el método remove para eliminar algún término dentro de la lista
     * @param termino identifica el término deseado
     * @return e es usado para eñ bucle y leer el dato
     * @throws TerminoNoEncontrado lanzará la excepción si el término no es encontrado en la lista
     */
    public Entrada remove(String termino) throws TerminoNoEncontrado {
        for (Entrada e : entradas) {
            if (e.getTermino().equalsIgnoreCase(termino)) {
                entradas.remove(e);
                nTerminos--;
                return e;
            }
        }
        throw new TerminoNoEncontrado();
    }
    /**
     * El método size mide el tamaño de la lista 
     * @return devuelve la cantidad de términos
     */
    public int size() {
        return nTerminos;
    }
    /**
     * El método exist verifica si el existe el término
     * @param termino
     * @return true si existe y false si no
     */
    public boolean exists(String termino) {
        for (Entrada e : entradas) {
            if (e.getTermino().equalsIgnoreCase(termino))
                return true;
        }
        return false;
    }

}