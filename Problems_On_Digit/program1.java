// Write a program which accept number from user and display its digits in reverse.
// input : 2395
// output : 5
//          9 
//          3 
//          2


import java.util.*;

class Number
{
    public void DisplayDigit(int No)
    {
        int iDigit = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            System.out.println(iDigit);
            No = No / 10;
        }
    }
}

class program1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        obj.DisplayDigit(iValue1);
    }   
}

