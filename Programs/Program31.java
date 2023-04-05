// Write a Program to find factorial of given number
// Input: 5
// Output: 120   (5 *4 *3 *2 *1)

import java.util.*;

class Number
{
    int Fact = 1;

    public int Factorial(int No)
    {
        for(int iCnt = No; iCnt >= 1; iCnt--)
        {
            Fact = Fact * iCnt;
        }
        return Fact;
    }
}

class Program31
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet =  obj.Factorial(iValue1);
        System.out.println("Factorial is : "+iRet);
    }   
}
