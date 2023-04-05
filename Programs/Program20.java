// Write a Program which accept one number from user and check whether that number is greater than 100 or not.
// input = 101               39
// output = Greater        Smaller 


import java.util.*;


class Number
{
    public boolean ChkGreater(int No)
    {
        if(No > 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program20
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue = sobj.nextInt();

        Number obj = new Number();

        boolean bRet = obj.ChkGreater(iValue);
        if(bRet == true)
        {
            System.out.println("Greater");
        }
        else
        {
            System.out.println("Smaller");
        }
    }
}
