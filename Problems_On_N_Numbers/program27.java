// Accept N nmber from user and accept one another number as NO,return index of first occurance of that NO.
//input   N :  6
//        NO : 66
//        eletments : 85 66 3 66 93 88
// output : 1

import java.util.*;


class Number
{
    public int []Arr;
    public int No;

    public Number(int Size, int i)
    {
        Arr = new int[Size];
        No = i;
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

    public int FirstOccurance()
    {
        int iCnt = 0;
        int i = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == No)
            {
                i++;
                break;
            }
        }
        
        if(i == 0)
        {
            return -1;
        }
        else
        {
            return iCnt;
        }
    }
}

class program27
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array you want");
        int value = sobj.nextInt();

        System.out.println("Enter the number you have to find");
        int value1 = sobj.nextInt();

        Number obj = new Number(value,value1);

        obj.Accept();
        obj.Display();

        int ret = obj.FirstOccurance();
        if(ret == -1)
        {
            System.out.println("There is no such number");
        }
        else
        {
            System.out.println("First Occurance at Index is "+ret);
        }
    }
}