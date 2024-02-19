import java.util.Scanner;

public class Ejercicio9 {
    static int numero_mayor(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        //Datos de entrada
        System.out.println("Ingrese dos números enteros: ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("a: ");
        int a = teclado.nextInt();
        System.out.println("b: ");
        int b = teclado.nextInt();
        //Obtener resultado y mostrarlo.
        int mayor = numero_mayor(a, b);
        System.out.println("El número mayor es: " + mayor);
    }
}
