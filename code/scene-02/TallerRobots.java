


public class TallerRobots {
    private Robot[] robots;
    private int capacidad;

    public TallerRobots(int capacidad) {
        this.capacidad = capacidad;
        this.robots = new Robot[capacidad];
    }

    public void agregarRobot(Robot robot) {
        for (int i = 0; i < robots.length; i++) {
            if (robots[i] == null) {
                robots[i] = robot;
                break;
            }
        }
    }

    public Robot buscarRobotDisponible() {
        for (Robot robot : robots) {
            if (robot != null && robot.estaDisponible()) {
                return robot;
            }
        }
        return null;
    }
}