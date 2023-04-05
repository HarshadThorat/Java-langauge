// Accept N nmber from user and return the Largest Number.
//input   N :  6
//        eletments : 85 66 3 66 93 88
// output :  93

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

    public int Largest()
    {          
        int iMax = Arr[0];

        for(int iCnt = 0; iCnt < Size ; iCnt++)
        {
            if((Arr[iCnt] > iMax) )
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}

class program16
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array you want");
        int value = sobj.nextInt();

        NumberX obj = new NumberX(value);

        obj.Accept();
        obj.Display();

        int ret = obj.Largest();
        System.out.println("Largest number is : "+ret);
    }
}