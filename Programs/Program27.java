// Write a Program which accept N from user and print all odd  number up to N.
// input = 18
// output = 1  3  5  7  9  11  13  15  17


import java.util.*;


class Number
{
    public void OddDisplay(int No1)
    {
        if(No1 < 0)
	    {
		    No1 = -No1;
	    }

        for(int iCnt = 1; iCnt <= No1; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}

class Program27
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        obj.OddDisplay(iValue1);
    }   
}
