import java.util.Scanner;

public class Ejercicio6 {
    static float area_rectangulo(float base, float altura) {
        return base * altura;
    }

    static float area_triangulo(float base, float altura) {
        return (base * altura) / 2;
    }

    static float hipotenusa(float lado_a, float lado_b) {
        //Teorema de Pitágoras h^2=c^2+d^2
        return (float) (Math.sqrt((lado_a * lado_a) + (lado_b * lado_b)));
    }

    public static void main(String[] args) {
        //Datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor de A: ");
        int a = teclado.nextInt();
        System.out.println("Ingresa el valor de B: ");
        int b = teclado.nextInt();
        System.out.println("Ingresa el valor de C: ");
        int c = teclado.nextInt();
        //Calcular dimensiones
        float rectangulo_area = area_rectangulo(b, c);
        float triangulo_area = area_triangulo(b, (a - c));
        float valor_hipotenusa = hipotenusa((a - c), b);
        //Mostrar resultados
        System.out.println("Perímetro = " + (a + b + c + valor_hipotenusa));
        System.out.println("Área Total = " + (rectangulo_area + triangulo_area));
    }
}
