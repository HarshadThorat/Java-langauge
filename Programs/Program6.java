//print 1 to 5 on screen

import java.util.*;

class Number
{
    public int No1;
    
    public Number(int i)
    {
        No1 = i;
   }

    public void Display()
    {
        for(int iCnt = 1; iCnt <= No1; iCnt++)
        {
            System.out.println("*");
        }
    }
}

class Program6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int Value1 = sobj.nextInt();

       
        Number obj = new Number(Value1);

        obj.Display();
          
    }
}

