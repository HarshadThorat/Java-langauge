//write java program which accept String from user and display below pattern?
// Input :  Row = 6  Col = 6

//1  2  3  4  5
//1  2        5
//1     3     5
//1        4  5
//1  2  3  4  5

import java.util.*;


class Pattern
{
    public void Display(int Row,int Col)
    {
        for(int i = 1; i <= Row; i++)
        {
            for(int j = 1; j <= Col; j++)
            {
                if((i == 1) || (i == Row) || (j == 1) || (j == Col))
                {
                    System.out.print(j+"\t");
                }
                else if(i == j)
                {
                    System.out.print(j+"\t");	
                }
                else
                {
                    System.out.print(" \t");	
                }
            }
            System.out.println("");
        }
    } 
}


class program50
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
