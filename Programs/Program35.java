//Accept amount in US dollar and return its corresponding value in Indian currency. 
// Consider 1$ as 70 rupees.
// Input :10                3
// Output : 700             210 

import java.util.*;

class Number
{
    public int No;

    public Number(int i)
    {
        No = i;
    }

    public int DollerToINR()
    {
        int iAns = 0;

        iAns = No * 70;
        return iAns;      
    }
}

class Program35
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number(iValue1);

        int iRet = obj.DollerToINR();

        System.out.println("Value in INR is : "+iRet);
        
    }   
}
