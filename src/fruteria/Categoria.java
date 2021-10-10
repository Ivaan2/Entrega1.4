package fruteria;
public enum Categoria implements ICategoria{
    MANZANA(2.10, Constantes.FULL_STOCK_MANZANAS),
    PLATANO(3.20, Constantes.FULL_STOCK_PLATANOS),
    MELOCOTON(2.40, Constantes.FULL_STOCK_MELOCOTONES);

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