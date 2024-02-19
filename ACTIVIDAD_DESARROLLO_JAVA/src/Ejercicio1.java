import java.util.Scanner;

public class Ejercicio1 {

    public static int evaluarPolinomio(int x, int y) {
        return (x * x) + (2 * x * y) + (y * y);
    }

    public static void main(String[] args) {

        // Read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();

        // Evaluate polynomial function
        int result = evaluarPolinomio(x, y);

        // Print result
        System.out.println("The result is " + result);

    }

}