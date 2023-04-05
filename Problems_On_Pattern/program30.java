//write java program which accept number of rows and columns from user and display below pattern?
// Input :  iRow = 3   iCol = 4
//  1 2 3 4
//  5 6 7 8  
//  9 10 11 12
//  

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int No = 1;

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(No+"\t");
                No++;
            }
            System.out.println();
        }
    }
}


class program30
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
