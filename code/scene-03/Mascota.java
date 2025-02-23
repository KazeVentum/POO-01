public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private boolean adoptada;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.adoptada = false;
    }

    public void adoptar() {
        this.adoptada = true;
    }

    public boolean estaAdoptada() {
        return adoptada;
    }
}