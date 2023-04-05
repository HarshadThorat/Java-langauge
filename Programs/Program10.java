//Accept two number and display first number in second number of times.

import java.util.*;

class Number
{
    public void Display(int No, int iFrequency)
    {
        for(int i = 1; i <= iFrequency; i++)
        {
            System.out.println(No);
        }
    }
}

class Program10
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

        System.out.println("Enter Frequency number");
        int Value2 = sobj.nextInt();
       
        Number obj = new Number();

        obj.Display(Value1,Value2);
        
    }
}

