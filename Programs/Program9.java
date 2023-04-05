//Accept one number and check whether it is Even or Odd.

import java.util.*;

class Number
{
    public boolean Display(int No)
    {
        if(No % 2 == 0)        
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program9
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

       
        Number obj = new Number();

        boolean bRet = obj.Display(Value1);
        if(bRet == true)
        {
            System.out.println("It is Even number");
        }
        else
        {
            System.out.println("It is Odd number");
        }
    }
}

