import java.util.Scanner;

public class Ejercicio11 {
    public static int getDecenas(int numero) {
        return numero / 10;
    }

    public static int getUnidades(int numero) {
        return numero % 10;
    }

    public static String unidadesARomanos(int unidades) {
        return switch (unidades) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }

    public static String decenasARomanos(int decenas) {
        return switch (decenas) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }

    public static void main(String[] args) {
        //Datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = teclado.nextInt();
        //Condicional para verificar si el número es válido.
        if (numero >= 1 && numero < 100) {
            //Calcular y mostrar datos de salida.
            int decenas = getDecenas(numero);
            int unidades = getUnidades(numero);
            String romanosDecenas = decenasARomanos(decenas);
            String romanosUnidades = unidadesARomanos(unidades);
            System.out.println(romanosDecenas + romanosUnidades);
        } else {
            System.out.println("Número no válido");
        }
    }
}
