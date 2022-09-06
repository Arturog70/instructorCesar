/*
10) Muestra los números del 1 al 100 (ambos incluidos). Usa un
bucle for.
 */
package ejercicosbyecesar;
import java.util.Scanner;
public class ejercicio9ByCesar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;
        System.out.println("digite la cantidad de termino");
       contador= entrada.nextInt();
        for (int i = 1; i <= contador; i++) {
            System.out.println(i);
        }
    }
}
