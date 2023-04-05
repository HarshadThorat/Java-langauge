//Accept number from user and print that number of * on screen

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
        int iCnt = 1;
        while(iCnt <= No1)
        {
            System.out.println("*");
            iCnt++;
        }
    }
}

class Program7
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

