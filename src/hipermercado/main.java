package hipermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private  static final int NUMERO_E = 40;
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        mostrarMenu();



    }

    private static void mostrarMenu() {
        boolean seguir = true;
        ArrayList<String> productos = new ArrayList<String>();
        int i = 0;

        System.out.println("** Primera hora de la mañana:\nllega la mercancía **");

        while(seguir) {
            System.out.println("Introduce un producto de categoría alimentos: ");
            productos.add(teclado.nextLine());
            cuestionarSeguir(seguir);
        }

    }

    private static boolean cuestionarSeguir(boolean seguir) {
        String s;

        do {
            System.out.println("¿Desea seguir intoduciendo productos? (S/N)");
            s = teclado.nextLine();
            s = s.toUpperCase();
        }while(!s.equals("S") && !s.equals("N"));

        if(s.equals("N")) {
            seguir = false;
        }
        return seguir;
    }

}