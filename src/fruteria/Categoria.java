package fruteria;
public enum Categoria implements ICategoria{
    MANZANA(Constantes.PRECIO_MANZANAS, Constantes.FULL_STOCK_MANZANAS),
    PLATANO(Constantes.PRECIO_PLATANOS, Constantes.FULL_STOCK_PLATANOS),
    MELOCOTON(Constantes.PRECIO_MELOCOTONES, Constantes.FULL_STOCK_MELOCOTONES);

    private double precio;
    private int stockMaximo;

    Categoria(double precio, int stockMaximo) {
        this.precio = precio;
        this.stockMaximo = stockMaximo;
    }

    public double getPrecio() {
        return precio;
    }
    public int getStockMaximo(){
        return stockMaximo;
    }
}