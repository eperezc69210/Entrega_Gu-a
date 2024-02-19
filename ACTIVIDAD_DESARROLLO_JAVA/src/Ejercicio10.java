import java.util.Scanner;

public class Ejercicio10 {
    public static int calcular(int num1, int num2, String operador) {
        int resultado;

        switch (operador) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> resultado = num1 / num2;
            case "%" -> resultado = num1 % num2;
            case "**" -> resultado = (int) Math.pow(num1, num2);
            default -> {
                System.out.println("Operador no válido");
                return 0;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        //Datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
        String operador = teclado.next();
        //Calcular y mostrar datos de salida.
        int resultado = calcular(num1, num2, operador);
        System.out.println("Resultado: " + resultado);
    }

}
