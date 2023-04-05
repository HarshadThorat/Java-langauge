// Accept N numbers from user and return frequency of 11 form it. 
// input : N:    6
// Elements : 85   11 3 15 11 111                   85   66  3  15  93  88            
// output :    2                                     0

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

    public int Frequency()
    {   
        int iFrequency = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                iFrequency++;
            }
        }
        return iFrequency;
    }
}

class program9
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want");
        int iValue = sobj.nextInt();

        NumberX obj = new NumberX(iValue);

        obj.Accept();
        obj.Display();

        int iRet = obj.Frequency();
        System.out.println("Frequency is : "+iRet);
    }
}