package fruteria;

public class Producto implements IProducto{
    private Categoria categoria;
    private int stock;
    private int cantidadComprada;
    private double precio;

    public Producto(Categoria categoria) {
        this.categoria = categoria;
        this.stock = categoria.getStockMaximo();
        this.precio = categoria.getPrecio();
        this.cantidadComprada = 0;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setCantidadComprada(int cantidadComprada){
        this.cantidadComprada = cantidadComprada;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return categoria + ": " + cantidadComprada + "kg x " + precio + "€/kg";
    }
}