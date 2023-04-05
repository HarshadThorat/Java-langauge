// Write a Program which accept number from user and print that number of $ and * on screen .
// input = 5
// output = $ * $ * $ * $ * $ *

import java.util.*;


class Number
{
    public void Display(int No1)
    {
        for(int iCnt = 1; iCnt <= No1; iCnt++)
        {
            System.out.print("$"+"\t"+"*"+"\t");
        }
    }
}

class Program24
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
