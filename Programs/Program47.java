// Write a Program which accept range from user and return addition of all even number in between that range.
// 23    35
// 174


import java.util.*;

class Number
{
    public int RangeEvenSum(int Start, int End)
    {
        int iSum = 0;

        for(int iCnt = Start; iCnt <= End; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

class Program47
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int iValue2 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.RangeEvenSum(iValue1, iValue2);
        System.out.println("Addition is : "+iRet);
    }   
}