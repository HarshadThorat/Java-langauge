// Write a Program which accept number from user and if number is less than 50 then print small, if it is greater than 50 and less than 100 then print medium, if it is greater than 100 then print large.
// Input: 75 
// Output: Medium

import java.util.*;

class Number
{
    public void Display(int No1)
    {
        if(No1 < 50)
        {
            System.out.println("Small");
        }
        else if((No1 > 50) && (No1 < 100))
        {
            System.out.println("Medium");
        }
        if(No1 > 100)
        {
            System.out.println("Large");
        }
    }
}

class Program29
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        obj.Display(iValue1);
    }   
}
