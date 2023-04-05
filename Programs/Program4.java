//print no Divisible by 5 or Not on screen

import java.util.*;

class Number
{
    public int No1;
    
    public Number(int i)
    {
        No1 = i;
   }

    public boolean Display()
    {
       if(No1 % 5 == 0)
       {
            return true;
       }
       else
       {
            return false;
       }
    }
}

class Program4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

       
        Number obj = new Number(Value1);

        boolean bRet = obj.Display();
        if(bRet == true)
        {
            System.out.println("Divisible by five");
        }  
        else
        {
            System.out.println("Not Divisible by five");
        }
    }
}

