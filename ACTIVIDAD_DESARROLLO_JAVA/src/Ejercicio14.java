import java.util.Scanner;

public class Ejercicio14 {
    public static String getHermanoMayor(String h1, int e1, String h2, int e2, String h3, int e3) {
        if (e1 >= e2 && e1 >= e3) {
            return h1;
        } else if (e2 >= e1 && e2 >= e3) {
            return h2;
        } else {
            return h3;
        }
    }

    public static void main(String[] args) {
        //Datos de entrada
        Scanner teclado = new Scanner(System.in);
        //Se usa un while por lo que se crea una variable "contador"
        int contador = 1;
        String[] nombres = new String[3];
        int[] edades = new int[3];
        while (contador <= 3) {
            System.out.println("Ingrese el nombre del hermano " + contador + ": ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese la edad del hermano " + contador + ": ");
            int edad = teclado.nextInt();
            teclado.nextLine();
            nombres[contador - 1] = nombre;
            edades[contador - 1] = edad;
            contador++;
        }
        //Obtener resultado y mostrarlo.
        String hermanoMayor = getHermanoMayor(nombres[0], edades[0], nombres[1], edades[1], nombres[2], edades[2]);
        System.out.println("El hermano mayor es: " + hermanoMayor);
    }
}