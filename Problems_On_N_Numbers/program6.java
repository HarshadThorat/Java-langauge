// Accept N numbers from user and return frequency of even numbers. 
// input : N:    6
// Elements : 85   66 3  80  93  88
// output :   3


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

    public int frequencyOfEven()
    {
        int iCntEven = 0;
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCntEven++;
            }    
        }
        return iCntEven;
        
    }
}

class program6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want");
        int iValue = sobj.nextInt();

        NumberX obj = new NumberX(iValue);

        obj.Accept();
        obj.Display();

        int iRet = obj.frequencyOfEven();
        System.out.println("Frequency of even numbers are : "+iRet);
    }
}