/*10) Muestra los números del 1 al 100 (ambos incluidos). Usa un
bucle while.*/
package ejercicosbyecesar;

import java.util.Scanner;

public class ejercico10Bycesar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un digito");

        int x = entrada.nextInt();
         while (x <= 100) {
            System.out.println(x);
            x++;
        }

    }
}
