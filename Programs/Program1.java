// problem to divide two numbers
import java.util.*;

class Number
{
    public int No1;
    public int No2;

    public Number(int i, int j)
    {
        No1 = i;
        No2 = j;
    }

    public int Divide()
    {
        int iAns = 0;

        iAns = No1 / No2;
        return iAns;
    }
}

class Program1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int Value2 = sobj.nextInt();

        Number obj = new Number(Value1, Value2);

        int iRet = obj.Divide();
        System.out.println("Division is : "+iRet);

          
    }
}

