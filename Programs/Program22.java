// Write a Program which accept Three number from user and print its Multiplication.
// input = 5   4   7
// output = 140

import java.util.*;


class Number
{
    public int Multiply(int No1, int No2, int No3)
    {
        int iAns = 0;

        if(No1 == 0)
        {
            iAns = No2 * No3;
            return iAns;
        }
        if(No2 == 0)
        {
            iAns = No1 * No3;
            return iAns;
        }
        if(No3 == 0)
        {
            iAns = No1 * No2;
            return iAns;
        }
        else
        {
            iAns = No1 * No2 * No3;
            return iAns;
        }
    }
}

class Program22
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int iValue2 = sobj.nextInt();

        System.out.println("Enter Third number");
        int iValue3 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.Multiply(iValue1, iValue2, iValue3);
        System.out.println("Multiplication is : "+iRet);
    }
}
