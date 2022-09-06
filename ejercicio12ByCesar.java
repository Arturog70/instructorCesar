/*
Realiza una aplicación que nos pida un número de ventas a introducir, 
después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
Al final mostrara la suma de todas las ventas. 
Piensa que es lo que se repite y lo que no.
 */
package ejercicosbyecesar;
import java.util.Scanner;
public class ejercicio12ByCesar {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el nuemro de ventas");
        int ventas= sc.nextInt();
        int total =0;
        
        for(int i = 1; i <=  ventas; i++){
            System.out.println("El numero de ventas es" +" "+ i);
            total += sc.nextInt();
        }
        System.out.println("Total de ventas" + " "+ total );
    }
    
    
}
