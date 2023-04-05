// Accept N numbers from user and return difference between summation of even and summation of odd elements. 
// input : N:    6
// Elements : 85   66 3  80  93  88
// output : 53  (234-181)

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

    public int Difference()
    {
        int EvenSum = 0;
        int OddSum = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                EvenSum = EvenSum + Arr[iCnt];
            }
            else
            {
                OddSum = OddSum + Arr[iCnt];
            }
        }
        return EvenSum - OddSum;
    }
}

class program1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Array you want");
        int iValue = sobj.nextInt();

        NumberX obj = new NumberX(iValue);

        obj.Accept();
        obj.Display();

        int iRet = obj.Difference();
        System.out.println("Difference is : "+iRet);
    }
}