// Write a program which accept number from user and count frequency of such a digit which are less than 6.
// input : 2395        1018            9440               96672
// output : 3          3               3                  1

import java.util.*;


class Number
{
    public int CountLessThanSix(int No)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(No > 0)
        {
            iDigit = No % 10;
            if(iDigit < 6)
            {
                iCnt++;
            }
            No = No / 10;
        }
        return iCnt;
    } 
}

class program5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.CountLessThanSix(iValue1);
        System.out.println("Number is less than 6 is : "+iRet);
        
    }   
}