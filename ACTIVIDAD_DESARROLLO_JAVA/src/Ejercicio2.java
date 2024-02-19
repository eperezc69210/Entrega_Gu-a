import java.util.Scanner;

public class Ejercicio2 {
    static int busesNecesarios(int flacos, int gordos, int sillas_por_bus) {
        int sillas_totales;
        sillas_totales = (gordos * 2) + flacos;
        float buses = (float) sillas_totales / sillas_por_bus;
        //Con el método "ceil" se aproxima al siguiente entero.
        return (int) Math.ceil(buses);
    }

    public static void main(String[] args) {
        //Ingreso de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos gordos van?: ");
        int gordos = teclado.nextInt();
        System.out.println("¿Cuántos flacos van?: ");
        int flacos = teclado.nextInt();
        System.out.println("¿Cuántas sillas tiene cada bus?: ");
        int sillas_por_bus = teclado.nextInt();
        //Calcular y mostrar datos de salida.
        int buses_necesarios = busesNecesarios(flacos, gordos, sillas_por_bus);
        System.out.println("Se necesitan alquilar " + buses_necesarios + " buses para llevar a los " + (gordos + flacos) + " estudiantes al paseo.");
    }
}
