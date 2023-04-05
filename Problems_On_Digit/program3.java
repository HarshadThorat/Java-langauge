// Write a program which accept number from user and count frequency of 2 int it.
// input : 2395        1018            9000               922432
// output : 1          0               0                  3

import java.util.*;

class Number
{
    public int ChkTwo(int No)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(No > 0)
        {
            iDigit = No % 10;
            if(iDigit == 2)
            {
                iCnt++;
            }
            No = No / 10;
        }
        return iCnt;
    } 
}

class program3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.ChkTwo(iValue1);
        System.out.println("Frequency of Two is : "+iRet);
        
    }   
}