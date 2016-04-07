package day7Labs;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// Create a two-dimensional jagged array
		int [] [] jagArray = new int [4] [];
		
		int [] listOfCols = {2,4,1,5};
		
		int sum = 0;
		
		// Create for loop for 2 dimensional array and initial
		// This loop is for the rows
		for (int i = 0; i < jagArray.length; i++) { //focus on and love this formula
				jagArray[i] = new int[listOfCols[i]];
				
			}
			

/*		
		// Create a two-dimensional array
		int [] [] gameBoard = new int [3] [3];
		int sum = 0;
		
		// Create for loop for 2 dimensional array and initial
		// This loop is for the rows
		for (int i = 0; i < gameBoard.length; i++) {
			
			//This loop is for the columns
			for (int j = 0; j < gameBoard[i].length; j++) {
				sum += gameBoard [i] [j];
				
			}
			
		}
		System.out.println(sum);
*/		
/*		Scanner sc = new  Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		
		int [] array1 = new int[size];
		
		//int [] array2 = {1,2,3,4,5,6,7,8,9,10};
		
		int [] array2 = new int[10];
		Arrays.fill(array2, 1);
		
		int sum = 0;
		//Accessing elements in an array
		for (int i = 0; i < array2.length; i++) {
			sum = sum + array2[i];
			//System.out.println(array2[i]);
		}
		// Grabbing user input and filling array in reverse	
		for (int d = array2.length - 1; d >= 0; d--) {
		
		}
		// Enhanced for loop.....saying For each element inside array2
		for (int element : array2){
			sum += element;
		}
*/		
//System.out.println(sum);
	}

}
