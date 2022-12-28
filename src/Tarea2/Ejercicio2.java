package Tarea2;

import java.util.Scanner;

public class Ejercicio2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca el precio base");
            int precioBase = scanner.nextInt();
            double IVA = precioBase * 0.21;
            double precioTotal = precioBase + IVA;
            System.out.println("El monto total es: " + precioTotal);
        }

}
