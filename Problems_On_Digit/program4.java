// Write a program which accept number from user and count frequency of 4 int it.
// input : 2395        1018            9440               922432
// output : 0          0               2                  1

import java.util.*;

class Number
{
    public int CountFour(int No)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(No > 0)
        {
            iDigit = No % 10;
            if(iDigit == 4)
            {
                iCnt++;
            }
            No = No / 10;
        }
        return iCnt;
    } 
}

class program4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.CountFour(iValue1);
        System.out.println("Frequency of four is : "+iRet);
        
    }   
}