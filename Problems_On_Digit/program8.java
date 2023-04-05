// Write a program which accept number from user and return the count of digits in between 3 and 7.
// input : 2395       1018        4521        
// output : 1         0           2  

import java.util.*;

class Number
{
    public int CountRange(int No)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(No > 0)
        {
            iDigit = No % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                iCnt++;
            }
            No = No / 10;
        }
        return iCnt;
    } 
}

class program8
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.CountRange(iValue1);
        System.out.println("number in between 3 & 7 is : "+iRet);
        
    }   
}