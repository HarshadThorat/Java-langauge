// write a Program which accept number from user and display its multiplication of factor??
// input = 12
// output =  1 * 2 * 3 * 4 * 6

import java.util.*;

class Number
{
    public int MultFactor(int No)
    {
        int iMult = 1;

        for(int i = 1; i <= No/2; i++)
        {
            if(No % i == 0)
            {
                iMult = iMult * i;
            }
        }
        return iMult;
    }
}

class Program14
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.MultFactor(Value1);

        System.out.println("Multiplication of factor is : "+iRet);        
    }
}

