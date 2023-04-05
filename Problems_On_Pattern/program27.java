//write java program which accept number of rows and columns from user and display below pattern?
// Input :  iRow = 4   iCol = 4
//  A B C D
//  a b c d  
//  A B C D
//  a b c d

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        char ch1 = 'A';
        char ch2 = 'a';

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i % 2 != 0)
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }
                else
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
            }
            System.out.println();
            ch1 = 'A';
            ch2 = 'a';
        }
    }
}


class program27
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
