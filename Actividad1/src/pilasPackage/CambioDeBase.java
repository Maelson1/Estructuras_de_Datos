package pilasPackage;

public class CambioDeBase {
	/**
	 * Creamos el método convertirBase con los siguientes parámetros
	 * @param numero número ingresado por el usuario
	 * @param base base ingresada por el usuario
	 * @param pila el tipo de pila seleccionada
	 * @return resultado
	 */
	public static String convertirBase(int numero, int base, Stack<Integer> pila) {
		/**
		 * Definimos cómo va funcionar nuestro cambio de base
		 * Si la base es menor que 2 o mayor a nueve verificará lo siguiente:
		 * 1. si el número es 0 devolvera 0
		 * 2. mientras el número sea positivo, se va a pushear el residuo, posteriormente divide numero entre base y lo guarda en la variable
		 * Luego asigna un resultado iniciadizado sin contenido (de tipo String) mediante el push
		 * Finalmente devuelve el resultado
		 */
	    if (base < 2 || base > 9) {
			
		}

	    if (numero == 0) {
			return "0";
		}

	    while (numero > 0) {
	        int residuo = numero % base;
	        pila.push(residuo);
	        numero /= base;
	    }

	  String resultado = "";
        while (!pila.isEmpty()) {
            resultado = resultado + pila.pop();  
        }

        return resultado;
    }
}