// Accept N nmber from user and accept range . Display all elments from that range.
//input   N :  6
//        start : 60
//        end    : 90  
//        eletments : 85 66 3 66 93 88
// output : 66 85 88

import java.util.*;


class Number
{
    public void DisplayRange(int Arr[],int start, int end)
    {
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= start) && (Arr[iCnt] <= end))
            {
                System.out.print(Arr[iCnt]+"\t");
            }
        }
    }
}

class program29
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array you want");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter the Elements of array");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the Start point");
        int value1 = sobj.nextInt();
        
        System.out.println("Enter the End point");
        int value2 = sobj.nextInt();

        Number obj = new Number();

        obj.DisplayRange(Arr,value1,value2);
        
    }
}