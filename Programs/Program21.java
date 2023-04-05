// Write a Program which accept two number from user and check whether number is equal or not .
// input = 10  10         10  12
// output = equal        not equal 

import java.util.*;


class Number
{
    public boolean CheckEqual(int No1, int No2)
    {
        if(No1 == No2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program21
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int iValue2 = sobj.nextInt();

        Number obj = new Number();

        boolean bRet = obj.CheckEqual(iValue1, iValue2);
        if(bRet == true)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
