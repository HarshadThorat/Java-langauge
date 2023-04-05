// Accept number from user and display below pattern
// input : 5
// output : 5  #   4   #   3   #   2   #   1   #

import java.util.*;

class NumberX
{
    public int No;

    public NumberX(int A)
    {
        No = A;
    }

    public void Pattern()
    {
        
        for(int iCnt = No; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t"+"#"+"\t");
        }
    }
}

class program2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        NumberX obj = new NumberX(value);

        obj.Pattern();
    
    }
}