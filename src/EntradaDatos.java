import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaDatos {
    public static List<Double> obtenerCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        List<Double> calificaciones = new ArrayList<>();
        System.out.println("Ingrese calificaciones (-1 para terminar):");
        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) break;
            calificaciones.add(nota);
        }
        return calificaciones;
}

}
