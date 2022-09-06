package ejercicosbyecesar;

import java.util.Scanner;

public class Ejercicio6ByCesar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int x = sc.nextInt();
        System.out.println("Introduce otro numero");
        int y = sc.nextInt();
        if (y / x == 0) {
            System.out.println(x + " es divisible por " + y);
        } else {
            System.out.println(x + " no es divisible entre " + y);
        }
        
       }
}
