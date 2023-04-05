// write a Program which accept number from user and return difference between summation of all its Non-factor and factors??
// input = 12        10 
// output = -34     -29


import java.util.*;

class Number
{
    public int Difference(int No)
    {
        int iSum1 = 0;
        int iSum2 = 0;

        for(int i = 1; i < No; i++)
        {
            if(No % i == 0)
            {
                iSum1 = iSum1 + i;
            }
            else
            {
                iSum2 = iSum2 + i;
            }
        }
        return iSum1 - iSum2;
    }
}

class Program18
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.Difference(Value1);
        System.out.println("Difference is : "+iRet);


    }
}
