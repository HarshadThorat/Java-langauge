// write java program which Accept N number from user and accept one another number as NO,check Whether No is present or not.
//input   N :  6
//        NO : 66
//        eletments : 85 66 3 66 93 88
// output : Present

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

    public boolean Check()
    {
        boolean flag = false;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == No)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

class program26
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array you want");
        int size = sobj.nextInt();
    
        
        System.out.println("Enter the number you have to find");
        int value1 = sobj.nextInt();

        Number obj = new Number(size,value1);

        obj.Accept();
        obj.Display();

        boolean bret = obj.Check();
        if(bret == true)
        {
            System.out.println("Number is present");            
        }
        else
        {
            System.out.println("Number is Not present");

        }
    }
}