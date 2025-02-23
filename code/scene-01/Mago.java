import code.CriaturaMagica;

public class Mago {
    private String nombre;
    private int nivelMagia;
    private String[] hechizosAprendidos;
    private int energia;

    public Mago(String nombre) {
        this.nombre = nombre;
        this.nivelMagia = 1;
        this.hechizosAprendidos = new String[10];
        this.energia = 100;
    }

    public void aprenderHechizo(String hechizo) {
        for (int i = 0; i < hechizosAprendidos.length; i++) {
            if (hechizosAprendidos[i] == null) {
                hechizosAprendidos[i] = hechizo;
                break;
            }
        }
    }

    public void combatirCriatura(CriaturaMagica criatura) {
        if (energia >= 10) {
            energia -= 10;
            criatura.recibirDano(nivelMagia * 5);
        }
    }

    public void subirNivel() {
        this.nivelMagia++;
        this.energia = 100;
    }
}