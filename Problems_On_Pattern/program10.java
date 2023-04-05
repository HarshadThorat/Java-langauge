// Accept number of Rows and number of Column from user and display below pattern
/* 
input : iRow = 4      iCol = 4
   
1   1   1   1
2   2   2   2
3   3   3   3
4   4   4   4

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
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");     
            }
            System.out.println();
        }
    }
}

class program10
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