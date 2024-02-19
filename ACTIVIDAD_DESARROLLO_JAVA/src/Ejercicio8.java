import java.util.Scanner;

public class Ejercicio8 {
    static int numero_salones(int estudiantes, int capacidad_salon) {
        return (int) Math.ceil((double) estudiantes / capacidad_salon);
    }

    static int numero_pisos(int salones, int salones_piso) {
        return (int) Math.ceil(salones / salones_piso);
    }

    public static void main(String[] args) {
        //Datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de estudiantes que tiene la Universidad: ");
        int estudiantes = teclado.nextInt();
        System.out.println("Ingrese la capacidad de estudiantes por salón: ");
        int capacidad_salon = teclado.nextInt();
        int salones = numero_salones(estudiantes, capacidad_salon);
        System.out.println("¿Cuántos salones pueden haber por piso?: ");
        int salones_piso = teclado.nextInt();
        //Calcular y mostrar datos de salida.
        int pisos = numero_pisos(salones, salones_piso);
        System.out.println("La cantidad de salones necesaria es " + salones + " salones distribuidos en " + pisos + " pisos.");
    }
}
