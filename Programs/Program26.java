// Write a Program which accept number from user and print its number line.
// input = 4
// output = -4  -3  -2  -1  0  1  2  3  4

import java.util.*;


class Number
{
    public void Display(int No1)
    {
        for(int iCnt = -No1; iCnt <= No1; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }
}

class Program26

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
