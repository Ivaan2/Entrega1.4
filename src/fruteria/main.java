package fruteria;

import java.util.Scanner;

public class main {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Producto manzanas, melocotones, platanos;
        manzanas = new Producto(Categoria.MANZANA);
        melocotones = new Producto(Categoria.MELOCOTON);
        platanos = new Producto(Categoria.PLATANO);
        llegadaClientes(manzanas, melocotones, platanos);
    }

    private static void llegadaClientes(Producto manzanas, Producto melocotones, Producto platanos) {
        boolean salir;
        double factura = 0;

        System.out.println("** FRUTERIA HNOS PERNIA **");
        System.out.println("Vayan cogiendo sus tickets y guarden cola, por favor.");

        for (int i = 0; i < Constantes.NUMERO_CLIENTES; i++){
            salir = false;
            System.out.println("Bienvenido cliente nº: " + (i+1) + "\nOfrecemos un decuento del 10% para compras superiores a 10€");
            while(!salir){

                String tipoFruta = solicitarProducto("Elija que desea entre(" + Categoria.MANZANA + ", " + Categoria.MELOCOTON + " y " + Categoria.PLATANO + ")");
                int cant = solicitarEntero("¿Cuántos Kg quieres?");

                switch (tipoFruta){
                    case "MANZANA":
                        if(manzanas.getCantidad() >= cant){
                            manzanas.setCantidad(manzanas.getCantidad()-cant);
                            factura = factura + cant * manzanas.getPrecio();
                        }else{
                            System.out.println("No se pudo completar la operación, manzanas disponibles: " + manzanas.getCantidad());
                        }
                        break;

                    case "MELOCOTON":
                        if(melocotones.getCantidad() >= cant){
                            melocotones.setCantidad(melocotones.getCantidad()-cant);
                            factura = factura + cant * melocotones.getPrecio();
                        }else{
                            System.out.println("No se pudo completar la operación, melocotones disponibles: " + melocotones.getCantidad());
                        }
                        break;

                    case "PLATANO":
                        if(platanos.getCantidad() >= cant){
                            platanos.setCantidad(platanos.getCantidad()-cant);
                            factura = factura + cant * platanos.getPrecio();
                        }else{
                            System.out.println("No se pudo completar la operación, plátanos disponibles: " + platanos.getCantidad());
                        }
                        break;
                }
                salir = cuestionarSeguir();
            }
            if(factura > Constantes.FACTURA_OFERTA){
                System.out.println("La factura original es de: " + factura + "€");
                factura = factura * Constantes.DESCUENTO;
                System.out.println("Tras nuestra oferta se reduce a un total de : " + factura + "€");
            }else {
                System.out.println("La factura a pagar es : " + factura + "€");
            }
        }
    }

    private static int solicitarEntero(String s) {
        int i;
        System.out.println(s);
        i = Integer.parseInt(teclado.nextLine());
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