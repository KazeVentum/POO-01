import code.CriaturaMagica;
import code.Mago;

public class MundoMagico {
    public static void main(String[] args) {
        Mago mago = new Mago("Merlin");
        CriaturaMagica dragon = new CriaturaMagica("Smaug", "Dragon");
        
        mago.aprenderHechizo("Fireball");
        mago.combatirCriatura(dragon);
        mago.subirNivel();
    }
}