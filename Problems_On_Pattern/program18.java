// Accept number of Rows and number of Column from user and display below pattern
/* 
input : iRow = 4      iCol = 5
   
2   4    6    8    10
A   B    C    D    E
2   4    6    8    10
A   B    C    D    E

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
                if(i % 2 != 0)
                {
                    System.out.print(2*j+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                    ch++;
                }
            }
            System.out.println();
            ch = 'A';
        }
    }
}

class program18
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