//write a Program which accept one number from user and print  factors of that number
// input : 24
// output : 1  2  4  6  8  12  

import java.util.*;

class Number
{
    public void Display(int No)
    {
        for(int i = 1; i < No/2; i++)
        {
            if(No % i == 0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}

class Program12
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

