// write a Program ehich return diff between even factorial and odd factorial of given number.
// input : 5
// output : -7    (8 - 15)

import java.util.*;

class Number
{
    int EvenFact = 1;
    int OddFact = 1;

    public int Difference(int No)
    {
        for(int iCnt = 1; iCnt <= No; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                EvenFact = EvenFact * iCnt;
            }
            else
            {
                OddFact = OddFact * iCnt;
            }
        }
        return EvenFact - OddFact;
    }
}

class Program38
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        int iRet =  obj.Difference(iValue1);
        System.out.println("Difference is : "+iRet);
    }   
}