// write a Program to find odd factorial of given number
// input : 5
// output : 15    (5 * 3 * 1)

import java.util.*;

class Number
{
    int Fact = 1;

    public int EvenFactorial(int No)
    {
        for(int iCnt = 1; iCnt <= No; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                Fact = Fact * iCnt;
            }
        }
        return Fact;
    }
}

class Program37
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet =  obj.EvenFactorial(iValue1);
        System.out.println("Factorial is : "+iRet);
    }   
}