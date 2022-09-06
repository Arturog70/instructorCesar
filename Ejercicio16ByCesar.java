
package ejercicosbyecesar;

import java.util.Scanner;

/**
15) Lee un número por teclado y comprueba que este numero es
mayor o igual que cero, si no lo es lo volverá a pedir (do while),
después muestra ese número por consola.
 */
public class Ejercicio16ByCesar {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un nuemro");
         int i= sc.nextInt();
         int x= i;
         
        while(x<= 0){
        System.out.println(x + "Es mayor a 0");
                x++;
             
    }
    }
    
}
