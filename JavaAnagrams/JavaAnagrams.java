/***************************************************************************************
********* Program Name *                JavaAnagram                            *********
****************************************************************************************
*********  Purpose     *      Given two strings it print "Anagrams" if they    *********
*********  of the      *    are anagrams, or  "Not Anagrams" if they are not;  *********
*********  Program     *     And the comparison should not be case sensitive.  *********
****************************************************************************************
********* Written By   *     Charles Amarachukwu Anurukem(Royalty)             *********
****************************************************************************************
********* Last Updated *       Sunday, March 19, 2017 @ 6:19 PM                *********
***************************************************************************************/

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagram {

	public static void main(String[] args) {
		//Instantiate a Scanner object
		Scanner read = new Scanner(System.in);
		
		//Create char array variables to hold the two strings as arrays
		char[] stringOneAsArray,stringTwoAsArray;
		
		//Read the strings from the console, convert the to lower case and then to character arrays
		stringOneAsArray = read.next().toLowerCase().toCharArray();
		stringTwoAsArray = read.next().toLowerCase().toCharArray();
		
		//Sort the two arrays
		Arrays.sort(stringOneAsArray);
		Arrays.sort(stringTwoAsArray);
		
		//Check if the two arrays are equal
		if(Arrays.equals(stringOneAsArray, stringTwoAsArray))
			//Print "Anagrams" if they are
			System.out.print("Anagrams");
		else
			//Print "Not Anagrams" if they ain't
			System.out.print("Not Anagrams");
		
		//Close the Scanner object to release resources
		read.close();
	}

}
