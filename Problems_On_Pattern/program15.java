// Accept number of Rows and number of Column from user and display below pattern
/* 
input : iRow = 3      iCol = 4
   
1   2   3   4
5   6   7   8
9   10  11  12

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
        int no = 1;

        for(int i = iRow; i >= 1; i--)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(no+"\t");
                no++;
            }
            System.out.println();
        }
    }
}

class program15
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