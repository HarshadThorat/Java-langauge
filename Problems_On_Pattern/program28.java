//write java program which accept number of rows and columns from user and display below pattern?
// Input :  iRow = 3   iCol = 5
//  A A A A A
//  B B B B B 
//  C C C C C
//  

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        char ch1 = 'A';

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(ch1+"\t");
            }
            System.out.println();
            ch1++;
        }
    }
}


class program28
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
