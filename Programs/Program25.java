// Write a Program which accept number from user ans print number till that number.
// input = 8
// output = 1 2 3  4 5 6 7 8

import java.util.*;


class Number
{
    public void Display(int No1)
    {
        for(int iCnt = 1; iCnt <= No1; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }
}

class Program25
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
