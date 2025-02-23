package code.scene-02;

public class Main {
    public static void main(String[] args) {
        TallerRobots taller = new TallerRobots(5);
        Robot robot1 = new Robot("R001", "Ensamblador");
        taller.agregarRobot(robot1);
        robot1.asignarTarea("Ensamblar motor");
    }
}
