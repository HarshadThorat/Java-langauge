// Write a program which accept number from user and check whether it contain 0 in it or not.
// input : 2395                       1018
// output : There is no zero         There is zero


import java.util.*;

class Number
{
    public boolean ChkZero(int No)
    {
        int iDigit = 0;

        while(No > 0)
        {
            iDigit = No % 10;
            if(iDigit < 1)
            {
                return true;
            }
            No = No / 10;
        }
    } 
}

class program2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        boolean bRet = obj.ChkZero(iValue1);
        if(bRet == true)
        {
            System.out.println("It contain Zero");
        }
        else
        {
            System.out.println("There is no Zero");
        }
    }   
}