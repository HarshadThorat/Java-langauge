// Write a program which accept number from user and return the Multiplication of all digits.
// input : 2395       1018        9440        
// output : 270         8         144    

import java.util.*;

class Number
{
    public int MultDigits(int No)
    {
        int iDigit = 0;
        int iMult = 1;

        while(No > 0)
        {
            iDigit = No % 10;
            if(iDigit == 0)
            {
                iDigit = 1;
            }
            iMult = iMult * iDigit;
            No = No / 10;
        }
        return iMult;
    } 
}

class program9
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.MultDigits(iValue1);
        System.out.println("Multiplication of all digits are : "+iRet);
        
    }   
}