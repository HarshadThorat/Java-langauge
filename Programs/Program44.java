// Write a Program which accept range from user and display all number in between that range.
// 23    35
// 23 24 25 26 27 28 29 30 31 32 33 34 35

import java.util.*;

class Number
{
    public void DisplayRange(int Start, int End)
    {
        for(int iCnt = Start; iCnt <= End; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }

        if(Start > End)
        {
            System.out.println("Invalid Range");
        }
    }

}

class Program43
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int iValue2 = sobj.nextInt();

        Number obj = new Number();

        obj.DisplayRange(iValue1, iValue2);
        
    }   
}