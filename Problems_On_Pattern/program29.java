//write java program which accept number of rows and columns from user and display below pattern?
// Input :  iRow = 4   iCol = 4
//  4 4 4 4 4
//  3 3 3 3 3  
//  2 2 2 2 2
//  1 1 1 1 1

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = iRow; i >= 1; i--)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}


class program29
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of Rows");
        int No1 = sobj.nextInt();
        
        System.out.println("Enter the number of Column");
        int No2 = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.Display(No1,No2); 
    }
}
