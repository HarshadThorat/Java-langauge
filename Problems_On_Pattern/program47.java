//write java program which accept String from user and display below pattern?
// Input :  Row = 4  Col = 4
// * * * #
// * * # @
// * # @ @
// # @ @ @


import java.util.*;

class Pattern
{
    public void Display(int Row, int Col)
    {
        for(int i = 1; i <= Row; i++)
        {
            for(int j = 1; j <= Col; j++)
            {
                if(i+j == 5)
                {
                    System.out.print("#\t");
                }
                else if(i+j >= 6)
                {
                    System.out.print("@\t");
                }
                else
                {
                    System.out.print("*\t");
                }   
            }
            System.out.println();
        }
    }
}


class program47
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
