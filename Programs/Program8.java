// Accept two number from user and display first number in second number of time

import java.util.*;

class Number
{
    public void Display(int No)
    {
        if(No < 10)        
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}

class Program8
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

       
        Number obj = new Number();

        obj.Display(Value1);
          
    }
}

