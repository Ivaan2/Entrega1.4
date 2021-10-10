package hipermercado;

public enum Categoria implements ICategoria{
    ALIMENTOS(7),
    ELECTRONICA(14),
    ROPA(10);

    private double iva;

    Categoria(double iva) {
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }
}
