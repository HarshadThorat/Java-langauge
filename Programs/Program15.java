// write a Program which accept number from user and display its factor in decreasing order??
// input = 12
// output =  6 4 3 2 1

import java.util.*;

class Number
{
    public void RevFactorDisplay(int No)
    {
        for(int i = No/2; i >= 1; i--)
        {
            if(No % i == 0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}

class Program15
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

        Number obj = new Number();

        obj.RevFactorDisplay(Value1);
        
    }
}
