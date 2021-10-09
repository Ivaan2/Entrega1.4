package hipermercado;

public class Producto {
    private Categoria categoria;
    private int cantidad;
    private double precio;

    public Producto(int cantidad, double precio, Categoria categoria) {
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [categoria=" + categoria + ", cantidad=" + cantidad + ", precio=" + precio + "]";
    }
}