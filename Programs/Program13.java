//write a Program which accept one number from user and print Even factors of that number
// input : 36
// output : 2  4  6  12  18 

import java.util.*;

class Number
{
    public void Display(int No)
    {
        for(int i = 1; i <= No/2; i++)
        {
            if((No % i == 0) && (i % 2 == 0))
            {
                System.out.print(i+"\t");
            }
        }
    }
}

class prorgram13
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

