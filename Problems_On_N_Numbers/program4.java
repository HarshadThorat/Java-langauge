// Accept N numbers from user and Display all such elements which are divisible by 3 & 5. 
// input : N:    6
// Elements : 85   66 3  15  93  88
// output :    15

import java.util.*;

class NumberX
{
    public int []Arr;

    public NumberX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of array : ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    
    public void Display()
    {
        System.out.println("Elements of array are : ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public void DivisibleBy5And3()
    {
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 3 == 0) && (Arr[iCnt] % 5 == 0))
            {
                System.out.println("Elements are");
                System.out.println(Arr[iCnt]);
            }    
        }
        
    }
}

class program4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter8 how many elements you want");
        int iValue = sobj.nextInt();

        NumberX obj = new NumberX(iValue);

        obj.Accept();
        obj.Display();

        obj.DivisibleBy5And3();
        
    }
}