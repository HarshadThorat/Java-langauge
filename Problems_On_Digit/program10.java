// Write a program which accept number from user and return difference between summation of even digits and summation of odd digits.
// input : 2395                 1018              8440        
// output : -15 (2 - 17)         6   (8-2)        16  (16-0)    

import java.util.*;

class Number
{
    public int CountDiff(int iNo)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }
            iNo = iNo / 10;
        }
        return (iSumEven - iSumOdd);
    } 
}

class program10
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.CountDiff(iValue1);
        System.out.println("Difference is : "+iRet);
        
    }   
}