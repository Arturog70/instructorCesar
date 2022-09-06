/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicosbyecesar;

import java.util.Scanner;
public class salidos {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		int A = sc.nextInt();
		
		System.out.print("Please, enter B side of a triangle: ");
		int B = sc.nextInt();
		
	
		System.out.print("Please, enter C side of a triangle: ");
		int C = sc.nextInt();
		
		int triangleArea= A+B+C;
	
	
	System.out.println("Triangle area is: " + triangleArea);
		
	}
}

