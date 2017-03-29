/************************************************************************************
********* Program Name    *                MagicSquare(3x3)                *********
*************************************************************************************
*********                 *       A program to place the numbers 1 - 9      *********
*********   Purpose       *                   in a 3 x 3 grid,              *********
*********   of the        *        one number such that the vertical,       *********
*********   Program       *           horizontal, and   diagonal            *********
*********                 *              sums are all the same.             *********
*************************************************************************************
*********  Written By     *       Charles Amarachukwu Anurukem(Royalty)     *********
*************************************************************************************
********* Github Username *                @princeCharlesRoyalty            *********
*************************************************************************************
********* Last Updated    *       Wednesday, March 29, 2017 @ 5:11 PM       *********
************************************************************************************/

public class MagicSquare {

	public static void main(String[] args) {
		int col,row,size=3;
		int[][]magicSquare = new int[size][size];
		row = size-1;
		col = size/2;
		for(int value=1;value<=size*size;value++){
			if(col == -1 && row==size){
				col=0;
				row = size-2;
			}
			else{
				if(col < 0)
					col=size - 1;
				if(row==size)
					row = 0;
			}
			if(magicSquare[row][col] != 0){
				col++;
				row-=2;
				value--;
			}
			else{
				magicSquare[row][col]= value;
				col--;
				row++;
			}
		}
		for(int r = 0; r < size; r++){
			for(int c=0; c < size; c++){
				System.out.print(magicSquare[r][c] +" ");
			}
			System.out.print("\n");
		}
			
				
	}

}
