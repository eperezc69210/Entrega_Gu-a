import java.util.Scanner;

public class Ejercicio4 {
    static float arriendo(int sueldo) {
        return (float) (sueldo * .4);
    }

    static float comida(int sueldo) {
        return (float) (sueldo * .15);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola Pedro, ingresa tu sueldo: ");
        //Dato de entrada
        int sueldo;
        sueldo = teclado.nextInt();
        //Calcular y mostrar datos de salida.
        float gasto_arriendo = arriendo(sueldo);
        float gasto_comida = comida(sueldo);
        System.out.println("El gasto en arriendo es: $" + gasto_arriendo);
        System.out.println("El gasto en comida es: $" + gasto_comida);
        System.out.println("El dinero que te queda es: $" + (sueldo - gasto_arriendo - gasto_comida));
    }
}
