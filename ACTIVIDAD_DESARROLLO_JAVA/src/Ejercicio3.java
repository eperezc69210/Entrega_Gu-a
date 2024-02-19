import java.util.Scanner;

public class Ejercicio3 {
    static float y(float x, float alpha) {
        //Ley de Senos
        float a = (float) Math.toRadians(90); //Ángulo recto
        return (float) (x / Math.sin(Math.toRadians(alpha)) * Math.sin(a)); //Para usar la funcón de seno, los ángulos deben estar en radianes.
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de x (altura): ");
        //Datos de entrada
        float x = teclado.nextFloat();
        System.out.println("Ingrese eñ valor de alfa (grado de inclinación): ");
        float alpha = teclado.nextFloat();
        //Calcular y mostrar datos de salida.
        float longitud_escalera = y(x, alpha);
        System.out.println("La longitud de la escalera es de " + longitud_escalera + " unidades.");
    }

}