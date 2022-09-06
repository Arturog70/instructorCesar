package ejercicosbyecesar;

import java.util.Scanner;

/**
Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
F = 32 + ( 9 * C / 5) 
 */
public class Ejercicio15ByCesar {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce los grados Centigrados");
        int gradosC= sc.nextInt();
        int fr = (32 + ( 9 * gradosC / 5));   
        System.out.println("Los Grados Farenhei son" + " "+ fr);
       }
}
