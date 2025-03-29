import java.util.List;

public class ProcesamientoDatos {
    public static double calcularPromedio(List<Double> calificaciones) {
        if (calificaciones.isEmpty()) return 0;
        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        return suma / calificaciones.size();
}

}
