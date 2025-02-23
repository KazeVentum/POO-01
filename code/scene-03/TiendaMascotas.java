public class TiendaMascotas {
    private Mascota[] mascotas;
    private Inventario[] productos;

    public TiendaMascotas() {
        this.mascotas = new Mascota[20];
        this.productos = new Inventario[50];
    }

    public void agregarMascota(Mascota mascota) {
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i] == null) {
                mascotas[i] = mascota;
                break;
            }
        }
    }

    public void agregarProducto(Inventario producto) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                break;
            }
        }
    }
}