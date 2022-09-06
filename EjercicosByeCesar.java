package ejercicosbyecesar;

import java.util.Scanner;

public class EjercicosByeCesar {

    public static void main(String[] args) {
        System.out.println("Hola introduce un nuemro");
        Scanner sc = new Scanner(System.in);    
        int num1 = sc.nextInt();
        System.out.println("Ahora introduce otro numero");
        int num2 = sc.nextInt();

        System.out.println("La suma de los siguientes numeros es" + " " + (num1 + num2));
        System.out.println("La resta de los siguientes numeros es" + " " + (num1 - num2));
        System.out.println("La multiplicacion de los siguientes numeros es" + " " + (num1 * num2));
        System.out.println("La divicion de los siguientes numeros es" + " " + (num1 / num2));
        System.out.println("El residuo de los siguientes numeros es" + " " + (num1 % num2));
    }
}
