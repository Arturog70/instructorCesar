package ejercicosbyecesar;

/*
 *Lee un número por teclado que pida el precio de un producto
(puede tener decimales) y calcule el precio final con IVA. El IVA sera
una constante que sera del 21%.
 */
import java.util.Scanner;

public class ejercicio8ByCesar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double producto = sc.nextInt();
        double Impuesto = producto * 1.21;

        System.out.println("El precio final es " + Impuesto);

    }
}
