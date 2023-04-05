// Write a Program which accept number from user and display its table
// Input: 2
// Output: 2   4  6  8  10 12 14 16 18 20


import java.util.*;

class Number
{
    public void DisplayTable(int No)
    {
        for(int iCnt = 1; iCnt <= No; iCnt++)
        {
            System.out.print(2*iCnt+"\t");
        }        
    }
}

class Program32
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        obj.DisplayTable(iValue1);
        
    }   
}
