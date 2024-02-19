import java.util.Scanner;

public class Ejercicio5 {
    static double area_circulo(float radio) {
        return (float) (Math.PI * radio * radio);
    }

    static double area_corona_circular(float radio_grande, float radio_peque) {
        return area_circulo(radio_grande) - area_circulo(radio_peque);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        System.out.println("Ingrese el valor de radio pequeño (r): ");
        float radio_peque = teclado.nextFloat();
        System.out.println("Ingrese el valor del radio grande (R): ");
        float radio_grande = teclado.nextFloat();
        //Calcular y mostrar datos de salida.
        System.out.println("El área de la corona circular es: " + area_corona_circular(radio_grande, radio_peque));
    }
}
