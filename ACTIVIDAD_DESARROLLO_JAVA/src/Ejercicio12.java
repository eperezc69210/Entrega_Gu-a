import java.util.Scanner;

public class Ejercicio12 {
    public static String obtenerDiaSiguiente(String dia) {

        return switch (dia.toLowerCase()) {
            case "lunes" -> "martes";
            case "martes" -> "miércoles";
            case "miércoles" -> "jueves";
            case "jueves" -> "viernes";
            case "viernes" -> "sábado";
            case "sábado" -> "domingo";
            case "domingo" -> "lunes";
            default -> "Día inválido";
        };
    }

    public static void main(String[] args) {
        //Datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un día de la semana: ");
        String dia = teclado.nextLine();
        //Obtener resultado y mostrarlo.
        String diaSiguiente = obtenerDiaSiguiente(dia);
        System.out.println("El día siguiente es: " + diaSiguiente);
    }
}
