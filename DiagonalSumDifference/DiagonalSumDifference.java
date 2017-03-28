/*******************************************************************************
********* Program Name *            DiagonalSumDifference              *********
********************************************************************************
*********  Purpose     *     Given a sqauare matrix of size NxN,it     *********
*********  of the      *      calculates the absolute difference       *********
*********  Program     *       between the sums of its diagonals       *********
********************************************************************************
********* Written By   *     Charles Amarachukwu Anurukem(Royalty)     *********
********************************************************************************
********* Last Updated *       Sunday, March 19, 2017 @ 12:10 AM       *********
*******************************************************************************/

import java.util.Scanner;
public class DiagonalSumDifference {

	public static void main(String[] args) {
		int N,maxIndex,primaryDiagonal=0,secondaryDiagonal=0;
		Scanner read = new Scanner(System.in);
		N = read.nextInt();
		int[][] matrixSquare = new int[N][N];
		maxIndex = N-1;
		for(int col = 0;col <= maxIndex;col++){
			for(int row = 0;row <= maxIndex;row++){
				matrixSquare[col][row] = read.nextInt();
				if(row==col)
					primaryDiagonal += matrixSquare[col][row];
				if(col == (maxIndex-row))
					secondaryDiagonal += matrixSquare[col][row];
			}
		}
		System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
		read.close();
	}

}
