// Accept N numbers from user and check whether that number contains 11 in it or not. 
// input : N:    6
// Elements : 85   66  11  80  93  88                  85   66  3  80  93  88            
// output :   11 is present                            11 is absent

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

    public boolean Check()
    {   
        boolean flag = false;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                flag = true;
                break;
                
            }
        }
        return flag;
    }
}

class program8
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want");
        int iValue = sobj.nextInt();

        NumberX obj = new NumberX(iValue);

        obj.Accept();
        obj.Display();

        boolean bRet = obj.Check();
        if(bRet == true)
        {
            System.out.println("11 is Present");
        }
        else
        {
            System.out.println("11 is absent");
        }
    }
}