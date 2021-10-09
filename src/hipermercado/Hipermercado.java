package hipermercado;

public class Hipermercado {
    Producto producto[];
    int i = 0;

    public Hipermercado(Producto p) {
        if(i == 0) {
            producto[i] = p;
        }

        i++;
        producto[i] = p;
    }
}
