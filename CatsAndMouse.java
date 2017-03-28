/***********************************************************************************************************************************
********* Program Name *                                        CatsAndMouse                                               *********
************************************************************************************************************************************
*********              *  A program to determine which of cat A or B at position x and y respectively catches the mouse at *********
*********  Purpose     *  position z all on the x-axis. Given q number of queries in for of x, y, and z. For each query,   *********
*********  of the      *  prints the appropriate answer on a new line: If cat A catches the mouse first, prints Cat A. if  *********
*********  Program     *          cat B catches the mouse first, prints Cat B, If both cats A reaches the mouse            *********
*********              *             at the same time, print Mouse C as the two cats fight and mouse escapes.              *********
************************************************************************************************************************************
********* Written By   *                            Charles Amarachukwu Anurukem(Royalty)                                  *********
************************************************************************************************************************************
********* Last Updated *                             Wednesday, March 22, 2017 @ 8:11 PM                                   *********
***********************************************************************************************************************************/

import java.util.Scanner;
public class CatsAndMouse {

    public static void main(String[] args) {
        int q;
        int[] x,y,z;
        Scanner read = new Scanner(System.in);
        q = read.nextInt();
        x = new int[q];
        y = new int[q];
        z = new int[q];
        for (int i =0;i<q;i++){
            x[i] = read.nextInt();
            y[i] = read.nextInt();
            z[i] = read.nextInt();
        }
        for (int i =0;i<q;i++){
            if ((Math.abs(z[i]-x[i]) -Math.abs(z[i]-y[i]))>0)
                System.out.println("Cat B");
            else if ((Math.abs(z[i]-x[i]) -Math.abs(z[i]-y[i]))<0)
                System.out.println("Cat A");
            else
                System.out.println("Mouse C");
        }

    }
}
