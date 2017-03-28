/******************************************************************************************
********* Program Name *                 ClimbingLeaderboard                      *********
*******************************************************************************************
*********              *   A program to determine and print the current rank of   *********
*********   Purpose    *    Alice after passing the jth level in a game, which    *********
*********   of the     *    is determined from an array, scores, of decreasing    *********
*********   Program    * leaderboard scores and another array, alice, of Alice's  *********
*********              *      cumulative score for each level of the game.        *********
*******************************************************************************************
*********  Written By  *       Charles Amarachukwu Anurukem(Royalty)              *********
*******************************************************************************************
********* Last Updated *        Saturday, March 25, 2017 @ 5:11 PM                *********
******************************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

public class ClimbingLeaderboard {

	public static void main(String[] args) {
		//Declare variables
		int n,m,aliceCumScore=0,rank =0;
		int[] scores,alice;
		ArrayList<Integer> noDublicateS = new ArrayList<Integer>();
		
		//Create a scanner object to get user inputs
		Scanner read = new Scanner(System.in);
		
		//Get the number of Scores
		n = read.nextInt();
		//Get the scores
		scores = new int[n];
		for(int i = 0;i<n;i++)
			scores[i] = read.nextInt();
		
		//Get the number of levels completed
		m = read.nextInt();
		//Get score for each level
		alice = new int[m];
		for(int i = 0;i < m;i++)
			alice[i] = read.nextInt();
		
		//Scores without duplicates
		for(int score :scores)
			if(!noDublicateS.contains(score))
				noDublicateS.add(score);
		
		//Find and print the rank of the cumulative score from the leader board
		for(int i=0;i<m;i++){
			
			aliceCumScore += alice[i];
			rank = 0;
			
			for(int j=0;j<noDublicateS.size();j++){
				if(aliceCumScore == noDublicateS.get(j)||aliceCumScore > noDublicateS.get(j)){
					rank = j+1;
					break;
				}
			}
			
			if(rank == 0)
				rank=noDublicateS.size()+1;
			//Print rank for each cumulative score of Alice
			System.out.println(rank);
			
		}
		
		//Close the Scanner object
		read.close();
	}

}
