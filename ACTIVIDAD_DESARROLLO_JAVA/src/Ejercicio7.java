import java.util.Scanner;

public class Ejercicio7 {
    static float distancia(int x1, int y1, int x2, int y2) {
        return (float) Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
    }

    static float pendiente(int x1, int y1, int x2, int y2) {
        return (float) ((y2 - y1) / (x2 - x1));
    }

    public static void main(String[] args) {
        //Datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas: ");
        System.out.println("x1 = ");
        int x1 = teclado.nextInt();
        System.out.println("y1 = ");
        int y1 = teclado.nextInt();
        System.out.println("x2 = ");
        int x2 = teclado.nextInt();
        System.out.println("y2 = ");
        int y2 = teclado.nextInt();
        //Calcular y mostrar datos de salida.
        float d = distancia(x1, y1, x2, y2);
        float m = pendiente(x1, y1, x2, y2);
        System.out.println("La distancia entre los dos puntos es: " + d);
        System.out.println("La pendiente de la recta que une estos dos puntos es: " + m);
    }
}
