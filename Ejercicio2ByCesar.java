package ejercicosbyecesar;

import java.util.Scanner;

public class Ejercicio2ByCesar {

    public static void main(String args[]) {
        System.out.println("Introduce un Numero Entero");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Ahora agrega otro numero");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " " + "Numero es mayor que " + " " + num2);
        } if (num1 == num2) {
            System.out.println(num2 + " " + "es igual a " + " " + num1);
        } else {
            System.out.println(num2 + " " + "Numero es mayor que " + " " + num1);
        }
    }

}