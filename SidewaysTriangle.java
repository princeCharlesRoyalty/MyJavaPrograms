/************************************************************************************
********* Program Name    *                SidewaysTriangle                 *********
*************************************************************************************
*********                 *      A program that uses only two outputs       *********
*********   Purpose       *       statements, System.out.print("#"),        *********
*********   of the        *    System.out.print("\n"), and two for loops    *********
*********   Program       *       to produce a pattern of hash  symbols     *********
*********                 *          shaped like a sideways triangle.       *********
*************************************************************************************
*********  Written By     *       Charles Amarachukwu Anurukem(Royalty)     *********
*************************************************************************************
********* Github Username *                @princeCharlesRoyalty            *********
*************************************************************************************
********* Last Updated    *         Tuesday, March 28, 2017 @ 5:11 PM       *********
************************************************************************************/


public class SidewaysTriangle {

	public static void main(String[] args) {
		//Number of rows should hold an odd number greater than or equal to 3
		int numRow = 7;
		int rowMidPoint = (numRow/2)+(numRow%2);
		int maxHashPerRow;
		for(int row = 1; row <= numRow; row++){
			maxHashPerRow = rowMidPoint- Math.abs(rowMidPoint - row);
			for(int hashCount = 1; hashCount <= maxHashPerRow;hashCount++){
				System.out.print("#");
			}
			System.out.print("\n");
		}

	}

}
