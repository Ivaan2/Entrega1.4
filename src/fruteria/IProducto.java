package fruteria;

public interface IProducto {
    public int getCantidad();
    public Categoria getCategoria();
    public double getPrecio();
    public void setCantidad(int cantidad);
    public void setPrecio(double precio);
}
