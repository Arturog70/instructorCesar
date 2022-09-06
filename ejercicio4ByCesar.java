package ejercicosbyecesar;
import static java.lang.Math.PI;
import java.util.Scanner;
public class ejercicio4ByCesar {

    public static void main(String[] args) {
        double radio, area;
        System.out.println("Introduce el radio del circulo");
        Scanner sc = new Scanner(System.in);
        radio = sc.nextInt();
        area = (radio * radio) * PI;
        System.out.println(" El area del circulo es " + area);
    }
}
