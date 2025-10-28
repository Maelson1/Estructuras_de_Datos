package ejercicio_pilas;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    static class Stack<T> {
        private ArrayList<T> pila = new ArrayList<>();

        public void push(T element) {
            pila.add(element);
        }

        public T pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("La pila está vacía");
            }
            return pila.remove(pila.size() - 1);
        }

        public boolean isEmpty() {
            return pila.isEmpty();
        }
    }
    public static String convertirBase(String decimalStr, int base) throws Exception {
        int numero = Integer.parseInt(decimalStr);

        if (base < 2 || base > 9) {
            throw new Exception("La base debe estar entre 2 y 9");
        }

        if (numero == 0) return "0";

        Stack<Integer> pila = new Stack<>();
        while (numero > 0) {
            pila.push(numero % base);
            numero /= base;
        }

       
        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        String numero = sc.nextLine();

        System.out.print("Introduce la base (2-9): ");
        int base = sc.nextInt();

        try {
            String convertido = convertirBase(numero, base);
            System.out.println("Número convertido a base " + base + ": " + convertido);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
