import java.util.ArrayList;

class Proceso {
    String id_proceso;
    int cedula;
    int tiempo_cpu;

    public Proceso(String id_proceso, int cedula, int tiempo_cpu) {
        this.id_proceso = id_proceso;
        this.cedula = cedula;
        this.tiempo_cpu = tiempo_cpu;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "id_proceso='" + id_proceso + '\'' +
                ", cedula=" + cedula +
                ", tiempo_cpu=" + tiempo_cpu +
                '}';
    }
}


