
package ejercicosbyecesar;

import java.util.Scanner;


public class cirluo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		
		double radio = sc.nextInt();
                
		double circleCircumference = 2* Math.PI* radio; //(radio * pi)*(radio * pi);

		System.out.println("Circle circumference is: " + circleCircumference);
	}
}
    


