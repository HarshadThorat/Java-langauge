// Accept N numbers from user and accept one another number as NO,  return frequency of NO form it. 
// input : N:    6
//  NO : 66
// Elements : 85  66  3   66  93  88                   85   11  3  15  11  111            
// output :    2                                       0

import java.util.*;

class NumberX
{
    public int []Arr;
    int No;

    public NumberX(int iSize,int i)
    {
        Arr = new int[iSize];
        No = i;
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
            if(Arr[iCnt] == No)
            {
                iFrequency++;
            }
        }
        return iFrequency;
    }
}

class program10
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want");
        int iValue = sobj.nextInt();

        System.out.println("Enter number");
        int ino = sobj.nextInt();

        NumberX obj = new NumberX(iValue,ino);

        obj.Accept();
        obj.Display();

        int iRet = obj.Frequency();
        System.out.println("Frequency is : "+iRet);
    }
}