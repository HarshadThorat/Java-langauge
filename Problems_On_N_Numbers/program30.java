// Accept N nmber from user and return product of all Odd numbers
//input   N :  6
//        eletments : 15 66 3 70 10 88
// output : 45  (15 * 3)

import java.util.*;


class Number
{
    public int OddProduct(int Arr[])
    {
        int Mult = 1;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                Mult = Mult * Arr[iCnt];
            }
        }
        return Mult;
    }
}

class program30
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

        Number obj = new Number();

        int ret = obj.OddProduct(Arr);
        System.out.println("Product of Odd Number is : "+ret);
    }
}