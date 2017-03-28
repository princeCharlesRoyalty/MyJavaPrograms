/***********************************************************************************
********* Program Name *                   PickingNumbers                  *********
************************************************************************************
*********              *       A program to determine and print the        *********
*********  Purpose     *          maximum number of integers you           *********
*********  of the      *          can select from an array such            *********
*********  Program     *       that the absolute difference between        *********
*********              *    between any two of the chosen number is <=1.   *********
************************************************************************************
********* Written By   *     Charles Amarachukwu Anurukem(Royalty)         *********
************************************************************************************
********* Last Updated *     Friday, March 24, 2017 @ 8:11 PM              *********
***********************************************************************************/

import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {
		//Declaration of varibles
		int N,max=0;
		int[] arr;
		
		//Instantiation of the Scanner object
		Scanner read = new Scanner(System.in);
		
		//Read the value of N
		N = read.nextInt();
		
		//Set the size of the array
		arr = new int[N];
		
		//Read N numbers and assign it to the to the array
		for(int i = 0;i<N;i++ )
			arr[i] = read.nextInt();
			
		//Loop through the N number of times
		for(int i = 0; i < N; i++ ){
			//Each times initialize counter to zero
			int counter = 0;
			//For each N time, loop N number of time
			for(int j = 0; j < N;j++ ){
				/*Excluding when i is equal to j. Check whether the absolute value of the number 
				at index i of the array subtracted from each of the 
				numbers at index j of the array is less than or equal to 1*/
				if((Math.abs(arr[i]-arr[j]) <= 1)&& i!=j)
					//Add one to counter whenever it is
					counter++;
			}
			//Check whether the counter is greater than max
			if(counter > max){
				//If it is true replace the value of max with the value of counter
				max = counter;
			}
		}
		
		//Print max
		System.out.print(max);
		
		//Close the read object
		read.close();
	}
}
