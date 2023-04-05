//print 5 times "Marvellous" on screen

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
        for(int iCnt = 0; iCnt < No1; iCnt++)
        {
            System.out.println("Marvellous");
        }
    }
}

class Program2
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

