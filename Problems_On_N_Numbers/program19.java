// Accept N  number from user and Display all such number which contain 3 digits in it.
//input   N :  6
//        eletments : 8225  665   3  76  953   858
// output :  665   935  858 ) 

import java.util.*;

class NumberX
{
    public int []Arr;
    public int Size;

    public NumberX(int A)
    {
        Size = A;
        Arr = new int[Size];
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

    public void Digit()
    {          
        System.out.println("Three Digit Numbers are : ");

        for(int iCnt = 0; iCnt < Size ; iCnt++)
        {
            if((Arr[iCnt] >= 100) && (Arr[iCnt] <= 1000) )
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class program19
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array you want");
        int value = sobj.nextInt();

        NumberX obj = new NumberX(value);

        obj.Accept();
        obj.Display();

        obj.Digit();
    
    }
}