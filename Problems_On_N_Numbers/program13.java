// Accept N number from user and accept one another number as NO,return index of Last occurance of that NO.
//input   N :  6
//        NO : 66
//        eletments : 85 66 3 66 93 88
// output : 3

import java.util.*;


class NumberX
{
    public int []Arr;
    public int Size;
    public int No;

    public NumberX(int A, int i)
    {
        Size = A;
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

    public int LastOccurance()
    {
        int iCnt = 0;
        
        for(iCnt = Size-1; iCnt >= 0 ; iCnt--)
        {
            if(Arr[iCnt] == No)
            {
                break;
            }
        }

        if(iCnt == Size)
            {
                return -1;
            }
            else 
            {
                return iCnt;
            }
    }
}

class program13
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array you want");
        int value = sobj.nextInt();

        System.out.println("Enter the number you have to find");
        int value1 = sobj.nextInt();

        NumberX obj = new NumberX(value,value1);

        obj.Accept();
        obj.Display();

        int ret = obj.LastOccurance();
        if(ret == -1)
        {
            System.out.println("There is no such number");
        }
        else
        {
            System.out.println("Last Occurance of the number is "+ret);
        }
    }
}