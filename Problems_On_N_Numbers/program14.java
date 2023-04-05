// Accept N number from user and accept range, Display all elements from that range.
//input   N :  6
//        Start : 60
//        End   : 90
//        eletments : 85 66 3 76 93 88
// output :  66  76  88 

import java.util.*;


class NumberX
{
    public int []Arr;
    public int Size;
    public int Start;
    public int End;

    public NumberX(int A, int i, int j)
    {
        Size = A;
        Arr = new int[Size];
        Start = i;
        End = j;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of array");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    
    public void Display()
    {
        System.out.println("Elements of array are ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public void DisplayRange()
    {   
        System.out.println("Numbers are");
        
        for(int iCnt = 0; iCnt < Size ; iCnt++)
        {
            if((Arr[iCnt] >= Start) && (Arr[iCnt] <= End))
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class program14
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array you want");
        int value = sobj.nextInt();

        System.out.println("Enter the Start point");
        int value1 = sobj.nextInt();
        
        System.out.println("Enter the End point");
        int value2 = sobj.nextInt();

        NumberX obj = new NumberX(value,value1,value2);

        obj.Accept();
        obj.Display();

        obj.DisplayRange();
    }
}