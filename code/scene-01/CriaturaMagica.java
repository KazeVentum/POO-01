package code;

public class CriaturaMagica {
    private String nombre;
    private String tipo;
    private int salud;
    private int poder;

    public CriaturaMagica(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.salud = 100;
        this.poder = 5;
    }

    public void recibirDano(int dano) {
        this.salud -= dano;
        if (this.salud < 0) {
            this.salud = 0;
        }
    }

    public void atacar(Mago mago) {
        if (this.salud > 0) {  
            int dano = this.poder * 2;  /
            mago.recibirDano(dano);
        }
    }
}
