// Write a Program which accept range from user and display all number in between that range in reverse order.
// 23    35
// 35 34 33 32 31 30 29 28 27 26 25 24 23


import java.util.*;

class Number
{
    public void ReverseRange(int Start, int End)
    {
        for(int iCnt = End; iCnt >= Start; iCnt--)
        {
            System.out.print(iCnt+"\t");       
        }
    }
}

class Program48
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int iValue2 = sobj.nextInt();

        Number obj = new Number();

        obj.ReverseRange(iValue1, iValue2);
    }   
}