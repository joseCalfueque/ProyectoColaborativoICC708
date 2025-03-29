public class main {
    public static void main(String[] args) {
        var calificaciones = EntradaDatos.obtenerCalificaciones();
        double promedio = ProcesamientoDatos.calcularPromedio(calificaciones);
        SalidaDatos.mostrarPromedio(promedio);
}

}
