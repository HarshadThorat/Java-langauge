// Write a Program which accept range from user and display all Even number in between that range.
// 23    35
// 24 26  28  30  32  34 

import java.util.*;

class Number
{
    public void EvenDisplayRange(int Start, int End)
    {
        for(int iCnt = Start; iCnt <= End; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }

        if(Start > End)
        {
            System.out.println("Invalid Range");
        }
    }

}

class Program45
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int iValue2 = sobj.nextInt();

        Number obj = new Number();

        obj.EvenDisplayRange(iValue1, iValue2);
        
    }   
}