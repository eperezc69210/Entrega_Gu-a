import java.util.Scanner;

public class Ejercicio13 {
    public static double calcularAumento(double sueldo) {

        if (sueldo <= 800000) {
            return sueldo * 0.1;
        } else if (sueldo <= 1200000) {
            return sueldo * 0.08;
        } else {
            return sueldo * 0.05;
        }

    }

    public static void main(String[] args) {
        //Datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el sueldo actual: ");
        double sueldoActual = teclado.nextDouble();
        //Obtener resultados.
        double aumento = calcularAumento(sueldoActual);
        double nuevoSueldo = sueldoActual + aumento;
        //Mostrarlos en pantalla.
        System.out.println("El aumento es de: " + aumento);
        System.out.println("El nuevo sueldo es: " + nuevoSueldo);
    }
}
