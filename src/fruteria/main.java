package fruteria;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        Producto manzanas = new Producto(Categoria.MANZANA);
        Producto melocotones = new Producto(Categoria.MELOCOTON);
        Producto platanos = new Producto(Categoria.PLATANO);

        llegadaClientes(manzanas, melocotones, platanos);
    }


    private static void mostrarFactura(double factura, ArrayList<Producto> listaCompra) {

        System.out.println("\nEl resumen de tu compra es: ");
        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println(listaCompra.get(i));
        }

        if(factura > Constantes.FACTURA_OFERTA){
            System.out.println("La factura antes de la promoción es de: " + factura + "€");
            factura = factura * Constantes.DESCUENTO;
            System.out.println("Tras nuestra oferta se reduce a un total de: " + factura + "€");
        }
        else {
            System.out.println("La factura a pagar es: " + factura + "€");
        }
    }

    private static void llegadaClientes(Producto manzanas, Producto melocotones, Producto platanos) {
        boolean salir;
        double factura = 0;
        ArrayList<Producto> listaCompra = new ArrayList<Producto>();

        System.out.println("** FRUTERIA HNOS PERNIA **");
        System.out.println("Vayan cogiendo sus tickets y guarden cola, por favor.");

        //Bucle encargado de tratar el número de clientes que entran en la frutería
        for (int i = 0; i < Constantes.NUMERO_CLIENTES; i++){
            salir = false;
            System.out.println("\nBienvenido cliente nº: " + (i+1) + "\nOfrecemos un decuento del 10% para compras superiores a 10€");

            //Bucle encargado de controlar la compra de cada cliente
            while(!salir){
                String tipoFruta = solicitarProducto("Elija que desea entre (" + Categoria.MANZANA + ", " + Categoria.MELOCOTON + " y " + Categoria.PLATANO + ")");
                int cant = solicitarEntero("¿Cuántos Kg quieres?");

                switch (tipoFruta){
                    case "MANZANA":
                        if(manzanas.getStock() >= cant){
                            manzanas.setStock(manzanas.getStock()-cant);
                            manzanas.setCantidadComprada(cant);
                            listaCompra.add(manzanas);
                            factura = factura + cant * manzanas.getPrecio();
                        }else{
                            System.out.println("No se pudo completar la operación, manzanas disponibles: " + manzanas.getStock());
                        }
                        break;

                    case "MELOCOTON":
                        if(melocotones.getStock() >= cant){
                            melocotones.setStock(melocotones.getStock()-cant);
                            melocotones.setCantidadComprada(cant);
                            listaCompra.add(melocotones);
                            factura = factura + cant * melocotones.getPrecio();
                        }else{
                            System.out.println("No se pudo completar la operación, melocotones disponibles: " + melocotones.getStock());
                        }
                        break;

                    case "PLATANO":
                        if(platanos.getStock() >= cant){
                            platanos.setStock(platanos.getStock()-cant);
                            platanos.setCantidadComprada(cant);
                            listaCompra.add(platanos);
                            factura = factura + cant * platanos.getPrecio();
                        }else{
                            System.out.println("No se pudo completar la operación, plátanos disponibles: " + platanos.getStock());
                        }
                        break;
                }

                salir = cuestionarSeguir();
            }
            mostrarFactura(factura, listaCompra);

            factura = 0;
            listaCompra.clear();
        }
    }

    private static int solicitarEntero(String s) {
        int i;

        do {
            System.out.println(s);
            i = Integer.parseInt(teclado.nextLine());
        }while (i <= 0);

        return i;
    }

    private static String solicitarProducto(String s) {
        String a;

        do {
            System.out.println(s);
            a = teclado.nextLine();
            a = a.toUpperCase();
        }while( !(a.equals("MANZANA")) && !(a.equals("MELOCOTON")) && !(a.equals("PLATANO")) );

        return a;
    }

    private static boolean cuestionarSeguir() {
        String s;
        boolean salir = true;

        do {
            System.out.println("¿Desea seguir comprando? (S/N)");
            s = teclado.nextLine();
            s = s.toUpperCase();
        }while(!s.equals("S") && !s.equals("N"));

        if(s.equals("S")) {
            salir = false;
        }
        return salir;
    }
}