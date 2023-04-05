// Write a Program which accept number from user and display its table in  reverse order.
// Input: 2
// Output: 20 18  16 14 12 10 8 6 4 2


import java.util.*;

class Number
{
    public void RevDisplayTable(int No)
    {
        for(int iCnt = No; iCnt >= 1; iCnt--)
        {
            System.out.print(2*iCnt+"\t");
        }        
    }
}

class Program33
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        obj.RevDisplayTable(iValue1);
        
    }   
}
