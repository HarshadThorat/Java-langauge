// Write a program which accept N from user and print first 5 multiples of N.
// input = 4
// output = 4   8   12   16   20

import java.util.*;


class Number
{
    public void MultDisplay(int No1)
    {
        if(No1 < 0)
	    {
		    No1 = -No1;
	    }

        for(int iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.print(No1 * iCnt+"\t");
        }
    }
}

class Program28
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        obj.MultDisplay(iValue1);
    }   
}
