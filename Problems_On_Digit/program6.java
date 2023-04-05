// Write a program which accept number from user and return the count of even digits.
// input : 2395       1018        8462        
// output : 1          2          4  

import java.util.*;

class Number
{
    public int CountEven(int No)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(No > 0)
        {
            iDigit = No % 10;
            if(iDigit % 2 == 0)
            {
                iCnt++;
            }
            No = No / 10;
        }
        return iCnt;
    } 
}

class program6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.CountEven(iValue1);
        System.out.println("Even numbers are  : "+iRet);
        
    }   
}