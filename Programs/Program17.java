// write a Program which accept number from user and return summation of all its Non-factor??
// input = 12        10 
// output = 50       37 

import java.util.*;

class Number
{
    public int AdditionNonFactor(int No)
    {
        int iSum = 0;

        for(int i = 1; i <= No; i++)
        {
            if(No % i != 0)
            {
                iSum = iSum + i;
            }
        }
        return iSum;
    }
}

class Program17
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.AdditionNonFactor(Value1);
        System.out.println("Addition is : "+iRet);


    }
}
