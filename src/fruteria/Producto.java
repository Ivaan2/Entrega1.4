package fruteria;

public class Producto implements IProducto{
    private Categoria categoria;
    private int cantidad;
    private double precio;

    public Producto(Categoria categoria) {
        this.categoria = categoria;
        this.cantidad = categoria.getStockMaximo();
        this.precio = categoria.getPrecio();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}