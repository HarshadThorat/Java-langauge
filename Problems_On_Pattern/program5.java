// Accept number from user and display below pattern
// input : 8
// output : 2   4   6   8  10  12  14  16


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
        for(int iCnt = 1; iCnt <= No; iCnt++)
        {
            System.out.print(2* iCnt+"\t");
        }
    }
}

class program5
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