package Ejercicio1;

public class CambioDeBase {
	public static String convertirBase(int numero, int base, Stack<Integer> pila) {
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
