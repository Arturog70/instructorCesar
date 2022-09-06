/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicosbyecesar;

import java.util.Arrays;
import java.util.Scanner;

public class SplitWords {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		System.out.print("You entered these words: " );
                System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));
		
	}

}
    

