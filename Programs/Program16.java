// write a Program which accept number from user and display all its  Non-factor??
// input = 12
// output = 5 7 8 9 10 11

import java.util.*;

class Number
{
    public void NonFactorDisplay(int No)
    {
        for(int i = 1; i <= No; i++)
        {
            if(No % i != 0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}

class Program16
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

        Number obj = new Number();

        obj.NonFactorDisplay(Value1);
        
    }
}
