/***********************************************************************************************************************
********* Program Name *                           Number_PalindromeManipulation                               *********
************************************************************************************************************************
*********              *       Takes an Integer n( 1<=n<1000) as an input and prints it on the screen          *********
*********  Purpose     *      if it is a palindrome. If not, you add the value  of the number read from        *********
*********  of the      *      left-to-right and its value read from right-to-left, and prints it on the        *********
*********  Program     *        screen if it is a palindrome. If  not,continues until a palindrome is          *********
*********              *   obtained and printed or prints "Too long" if the addition operations exceeds 25.    *********
************************************************************************************************************************
********* Written By   *                          Charles Amarachukwu Anurukem(Royalty)                        *********
************************************************************************************************************************
********* Last Updated *                            Sunday, March 19, 2017 @ 7:18 AM                           *********
***********************************************************************************************************************/

import java.util.Scanner;  
public class PalidromeManipulation {

	static boolean isPalindrome = false;
	public static void main(String[] args) {
		
		int number;
		Scanner read = new Scanner(System.in);
		
		number = read.hasNextInt() ? read.nextInt():0;
		
		if(ValidateInput(number))
			PrintResult(CheckPalindrome(number));
		else
			System.out.print("Invalid Input");
		read.close();
	}
	
	static int CheckPalindrome(int number){
		String numberAsString, reversedNumberAsString;
		int counter=1;
		
		while(counter <= 25 && isPalindrome == false){
			numberAsString = String.valueOf(number);
			reversedNumberAsString=ReverseText(numberAsString);
			if(numberAsString.equals(reversedNumberAsString))
				isPalindrome = true;
			else
				number = Integer.parseInt(numberAsString) + Integer.parseInt(reversedNumberAsString);
			counter++;
		}
		
		return number;
	}
	
	static boolean ValidateInput(int number){
		return number >= 1 && number<1000;
	}
	
	static String ReverseText(String text){
		String reversed ="";
		
		for(int i = text.length()-1; i >= 0 ;i--)
			reversed += text.charAt(i);
		return reversed;
	}
	
	static void PrintResult(int number){
		if(isPalindrome)
			System.out.print(number);
		else
			System.out.print("Too long");
	}

}
