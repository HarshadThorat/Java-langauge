// Write a Program which accept total marks & obtain marks from user and calculate percentage.
// input = 1000    745 
// output = 74.5


import java.util.*;


class Number
{
    public float Percentage(float Total, float Obtain )
    {
        float fAns = 0;

        fAns = (Obtain / Total) * 100;
        return fAns;
    }
}

class Program23
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int iValue2 = sobj.nextInt();

        Number obj = new Number();

        float fRet = obj.Percentage(iValue1, iValue2);
        System.out.println("Percentage is : "+fRet);
    }
}
