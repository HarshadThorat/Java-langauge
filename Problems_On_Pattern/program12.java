// Accept number of Rows and number of Column from user and display below pattern
/* 
input : iRow = 3      iCol = 5
   
A   A   A   A    A
B   B   B   B    B
C   C   C   C    C

*/

import java.util.*;

class NumberX
{
    public int iRow;
    public int iCol;

    public NumberX(int i, int j)
    {
        iRow = i;
        iCol = j;
    }

    public void Pattern()
    {
        char ch = 'A';

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");   
            }
            System.out.println();
            ch++;
        }
    }
}

class program12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Row");
        int value1 = sobj.nextInt();

        System.out.println("Enter the Column");
        int value2 = sobj.nextInt();

        NumberX obj = new NumberX(value1,value2);

        obj.Pattern();
    }
}