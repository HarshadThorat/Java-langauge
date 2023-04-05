//write a Program which accept one number from user and print that number of even number on screen
// input : 7
// output : 2 4 6 8 10 12 14

import java.util.*;

class Number
{
    public void Display(int No)
    {
        for(int i = 1; i <= No; i++)
        {
            System.out.print(2*i+"\t");
        }
    }
}

class Program11
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

