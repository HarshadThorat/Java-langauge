// Accept number from user and display below pattern
// input : 5
// output : A  B  C  D  E 

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
        char ch = 'A';

        for(int iCnt = 0; iCnt < No; iCnt++)
        {
            System.out.println(ch);
            ch++;
        }
    }
}

class program1
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