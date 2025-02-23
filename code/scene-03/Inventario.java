public class Inventario {
    private String producto;
    private int cantidad;
    private double precio;

    public Inventario(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void vender(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        }
    }

    public void reponerStock(int cantidad) {
        this.cantidad += cantidad;
    }
}
