package fruteria;

public interface IProducto {
    public int getStock();
    public Categoria getCategoria();
    public double getPrecio();
    public void setStock(int stock);
    public void setPrecio(double precio);
}
