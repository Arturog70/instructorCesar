package ejercicosbyecesar;
import java.util.Scanner;
/*
Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
Usa el método Math.random para generar un número entero aleatorio 
(recuerda el casting de double a int).
 */
public class ejercicio13ByCesar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("solicita un numero al usuario");
        int num1 = sc.nextInt();
        System.out.println("Ahora ingresa otro numero");
        int num2 = sc.nextInt();

        int min, max;
        if (num1 >= num2) {
            min = num2;
            max = num1;
        } else {
            min = num1;
            max = num2;

        }
        for (int i = 1; i <= 10; i++) {
            int random = (int) (Math.random() * max) - min;
            System.out.println(random);
        }

    }
}
