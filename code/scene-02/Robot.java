public class Robot {
    private String id;
    private String tipo;
    private boolean ocupado;
    private String tareaActual;

    public Robot(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.ocupado = false;
        this.tareaActual = null;
    }

    public void asignarTarea(String tarea) {
        this.tareaActual = tarea;
        this.ocupado = true;
    }

    public void completarTarea() {
        this.tareaActual = null;
        this.ocupado = false;
    }

    public boolean estaDisponible() {
        return !ocupado;
    }
}

